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
import com.kms.katalon.core.configuration.RunConfiguration
import java.io.File
import org.apache.commons.io.FilenameUtils
import org.openqa.selenium.chrome.ChromeOptions
WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.automationtesting.in/FileDownload.html')

WebUI.switchToWindowTitle('File input - Multi select')


//String projectDir = FilenameUtils.separatorsToSystem(RunConfiguration.getProjectDir())
//String path = FilenameUtils.concat(projectDir, 'My Downloads')


//String path = System.getProperty("user.dir");

//String otherFolder = path + File.separator + "My Downloads";

//println(otherFolder)



ChromeOptions options = new ChromeOptions();
String path = System.getProperty("user.dir");
String downloadPath = path + File.separator + "My Downloads";
//String downloadsPath = System.getProperty("user.home") + "/Downloads";
println (downloadPath)

Map<String, Object> chromePrefs = new HashMap<String, Object>()
chromePrefs.put("profile.default_content_settings.popups", 0);
chromePrefs.put("download.default_directory", downloadPath)
chromePrefs.put("download.prompt_for_download", false)

WebUI.enableSmartWait()

WebUI.click(findTestObject('Object Repository/a_Download'))

WebUI.delay(10)

WebUI.closeBrowser()