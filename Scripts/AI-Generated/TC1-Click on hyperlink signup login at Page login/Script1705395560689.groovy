import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page login, click on hyperlink signup login'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_login/hyperlink_signup_login'))

'Step 2: At Page home, click on hyperlink view product > navigate to Page product details/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_view_product'))

'Step 3: At Page product details/*, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/input_object'))

'Step 4: At Page product details/*, input on input object'

WebUI.setText(findTestObject('AI-Generated/Page_product_details/input_object'), var_1_)

'Step 5: At Page product details/*, input on input object'

WebUI.setText(findTestObject('AI-Generated/Page_product_details/input_object_1'), var_2_)

'Step 6: At Page product details/*, input on textarea review'

WebUI.setText(findTestObject('AI-Generated/Page_product_details/textarea_review'), var_3_)

'Step 7: At Page product details/*, click on button submit'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/button_submit'))

'Step 8: At Page product details/*, click on input object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/input_object_1'))

'Step 9: At Page product details/*, input on input object'

WebUI.setText(findTestObject('AI-Generated/Page_product_details/input_object_1'), var_4_)

'Step 10: At Page product details/*, click on button submit'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/button_submit'))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
