import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'Step 1: At Page home, click on ul object'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/ul_object'))

'Step 2: At Page home, click on hyperlink products > navigate to Page product details/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_home/hyperlink_products'))

'Step 3: At Page product details/*, click on hyperlink 3 mast harbour > navigate to Page brand products/*'

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_details/hyperlink_3_mast_harbour'))

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
