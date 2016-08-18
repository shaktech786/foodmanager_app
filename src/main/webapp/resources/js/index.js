function validateInput() {
    var ingredients = $('textarea').val();
    var ingredientsWithOutSpaces = ingredients.replace(/\s+/g, '');
    var ingredientsList = ingredientsWithOutSpaces.split(",");

    var mistakes = [];
    for (var i in ingredientsList) {
        if(isIngredientListValid(ingredients[i])) {
            mistakes.push(ingredientsList[i]);
        }
    }

    if (mistakes.length > 0) {
        $('#ingredient-error-message').text("The following errors must be corrected: " + mistakes);
        return false;
    } else {
        return true;
    }

}

function isIngredientListValid(ingredient) {
    return ingredient.match(/^[a-zA-Z]+$/)
}

