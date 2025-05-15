let currentPage = 0;

async function fetchProduct(page = 0) {
    const response = await fetch(`http://localhost:8080/api/v1/product?page=${page}`);
    const data = await response.json();

    renderProduct(data.items);
    updatePagination(data.page, data.hasNext);
}

function renderProduct(products) {
    const list = document.getElementById('product-list');
    list.innerHTML = '';

    if (products.length === 0) {
        list.innerHTML = '<p>Nenhum produto encontrado</p>';
        return;
    }

    products.forEach(product => {
        const div = document.createElement('div');
        div.className = 'product';
        div.innerHTML = `
            <strong>${product.name}</strong><br>
            Preço: R$ ${product.price}
        `;
        list.appendChild(div);
    });
}

function updatePagination(page, hasNext) {
    currentPage = page;
    document.getElementById('page-info').textContent = `Página ${page + 1}`;
    document.getElementById('prev-btn').disabled = page === 0;
    document.getElementById('next-btn').disabled = !hasNext;
}

document.getElementById('prev-btn').addEventListener('click', () => {
    if (currentPage > 0) {
        fetchProduct(currentPage - 1);
    }
});

document.getElementById('next-btn').addEventListener('click', () => {
    fetchProduct(currentPage + 1);
});

// Inicializar
fetchProduct();