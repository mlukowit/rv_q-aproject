const {webdriver, Builder, By, until} = require('selenium-webdriver'),
test = require('selenium-webdriver/testing'),
assert = require('assert');


let driver;

test.describe(creditcards.com URL), function() {
	
	test.beforeEach(function(done) {
	test.timeout(2000);
        driver=new webdriver.Builder().
	  withCapabilities(webdriver.Capabilites.firefox()0.build();
        driver.get('https://www.creditcards.com');

	done();

   	});

	test.it('Webpage should have expected title value', function (done) {
	var promise= driver.getTitle();
	promise.then(function(title) {
	assert.equal(title, 'www.CreditCards.com');
	
	});

       	done();

	test.after(() => driver.quit());

	});

