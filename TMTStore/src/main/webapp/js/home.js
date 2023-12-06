// categories.js

// Function to fetch and load categories using jQuery
function loadCategories() {
    $.ajax({
        url: '/your-web-app-context/category?action=getCategories',
        method: 'GET',
        dataType: 'json',
        success: function (categories) {
            const categoryButtonsContainer = $('#categoryButtons');

            // Create and append a button for each category
            categories.forEach(category => {
                const button = $('<button>').addClass('stext-106 cl6 hov1 bor3 trans-04 m-r-32 m-tb-5')
                    .attr('data-filter', `.${category.name.toLowerCase()}`)
                    .text(category.name);
                categoryButtonsContainer.append(button);
            });
        },
        error: function (error) {
            console.error('Error fetching categories:', error);
        }
    });
}

// Call the function to load categories when the page loads
$(document).ready(loadCategories);
