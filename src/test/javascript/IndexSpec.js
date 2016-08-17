describe('Index', function(){
	it('should call validateInput when submit button is clicked', function () {
		spyOn(window, 'validateInput');
		$("#submit").onclick();

		expect(window.validateInput()).toHaveBeenCalled();
	})
});