function validateInput() {
    var ingredients = $('textarea').val();
    var ingredientsWithOutSpaces = ingredients.replace(/\s+/g, '');

    var ingredientsList = ingredientsWithOutSpaces.split(",");
    var mistakes = [];
    for (var i in ingredientsList) {
        if(!ingredientsList[i].match(/[a-zA-Z]/)) {
            mistakes.push(ingredientsList[i]);
        }
    }
    if (mistakes.length > 0) {
        alert("The following ingredients " +
            "are not valid: " + mistakes);
        return false;
    }
    alert("Valid!");
    return true;
}

