import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import java.io.File as File
import org.apache.commons.io.FilenameUtils as FilenameUtils
import org.openqa.selenium.chrome.ChromeOptions as ChromeOptions

// Set the default download location to be the folder "My Downloads" on this project"
String path = System.getProperty('user.dir')
//
String DOWNLOAD_FOLDER_PATH = (path + File.separator) + 'Downloads'
//
Map prefs = [('download.default_directory') : DOWNLOAD_FOLDER_PATH]
//
//Map preferences key to manipulate page's language.
RunConfiguration.setWebDriverPreferencesProperty('prefs', prefs)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.webfx.com/archive/blog/images/assets/cdn.sixrevisions.com/0435-01_html5_download_attribute_demo/html5download-demo.html')

WebUI.switchToWindowTitle('HTML5 Download Attribute Demo')

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_HTML5 Download Attribute Demo/a_Download HTML Document'))

WebUI.click(findTestObject('Object Repository/Page_HTML5 Download Attribute Demo/a_Download HTML Document'))

WebUI.delay(3)

WebUI.closeBrowser()

// Pass your file name to fileName
String fileName = 'htmldoc.html'

// Pass your file path to downloadedFilePath
String downloadedFilePath = (DOWNLOAD_FOLDER_PATH + '/') + "$fileName" 

println(downloadedFilePath)

// Browsers typically require standard URLs (e.g., https://www.example.com/) to locate and fetch resources, including HTML files. 
// to open an html with Chrome, we need file:///

WebUI.openBrowser(('file:///') + downloadedFilePath)

