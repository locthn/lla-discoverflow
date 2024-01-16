import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page home, click on hyperlink signup login > navigate to Page login'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_signup_login'))

'Step 2: At Page login, click on input name'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_login/input_name'))

'Step 3: At Page login, input on input name'

WebUI.setText(findTestObject('AI-Generated/Page_login/input_name'), var_1_)

'Step 4: At Page login, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_login/input_email'), var_2_)

'Step 5: At Page login, click on button signup > navigate to Page signup'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_login/button_signup'))

'Step 6: At Page signup, click on input email'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/input_email'))

'Step 7: At Page signup, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_signup/input_email'), var_3_)

'Step 8: At Page signup, click on button signup'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signup'))

'Step 9: At Page signup, click on input email'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/input_email'))

'Step 10: At Page signup, click on input email'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/input_email'))

'Step 11: At Page signup, input on input email'

WebUI.setText(findTestObject('AI-Generated/Page_signup/input_email'), var_4_)

'Step 12: At Page signup, click on button signup'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_signup/button_signup'))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
