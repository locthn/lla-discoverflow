import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page test cases, click on hyperlink test case 5 register user with existing'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_test_case_5_register_user_with_existing'))

'Step 2: At Page test cases, click on hyperlink home > navigate to Page home'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_test_cases/hyperlink_home'))

'Step 3: At Page home, click on hyperlink view product > navigate to Page product details/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_view_product'))

'Step 4: At Page product details/*, click on button add to cart'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/button_add_to_cart'))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
