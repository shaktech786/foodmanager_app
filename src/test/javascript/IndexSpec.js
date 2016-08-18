describe('Index', function(){

    beforeAll(function() {
        var elements = [];
        elements.push("<p id='ingredient-error-message' style='display:none;'></p>");
        elements.push("<textarea style='display:none;'></textarea>");
        for (var i = 0; i < elements.length; i++) {
            $(document.body).append(elements[i]);
        }
    });

	it('should Display Error Message When One Of The Ingredients Contains A Symbol', function () {
       var ingredient =  $('textarea').text("apple, pear%%");

		validateInput();

		expect($('#ingredient-error-message').text()).toBe("The following errors must be corrected: pear%%");
	});

    it('should Display Error Message When One Of The Ingredients Contains A Number', function () {
        var ingredient =  $('textarea').text("apple, pear1");

        validateInput();

        expect($('#ingredient-error-message').text()).toBe("The following errors must be corrected: pear1");
    });

    it('should Display Error Message To Page When One Of The Ingredients Contains Numbers And Symbols', function () {
        var ingredient =  $('textarea').text("apple, pear123$$");

        validateInput();

        expect($('#ingredient-error-message').text()).toBe("The following errors must be corrected: pear123$$");
    });

    it('should Display Error Message To Page When Multiple Ingredients Contains Numbers And Symbols', function () {
        var ingredient =  $('textarea').text("apple, pear$$, peach123");

        validateInput();

        expect($('#ingredient-error-message').text()).toBe("The following errors must be corrected: pear$$,peach123");
    });

    it('should Return True When The Ingredients Entered Are Valid', function () {
        $('textarea').text("apple, pear");

        expect(validateInput()).toBe(true);
    })
});