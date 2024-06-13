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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://amtedivyanguniversity.ac.in/category.php?catid=2&pageid=12')

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/a_Faculty Members'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/a_Comptroller of Finance'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/strong_Shri Dhan Singh Meena'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/span__video-play-icon'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/span__video-play-icon'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/li_3rd Floor, Rajiv Gandhi Bhawan, Shiksha _85e993'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/a_registraramtedivyanguniversity.ac.in'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/a_DCE, Rajasthan'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/a_Registrar'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/a_Comptroller of Finance'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/a_Controller of Examination'))

WebUI.click(findTestObject('Object Repository/amteddivyanguniversity/Page_Welcome to The Baba Amte Divyang Unive_3777c8/td_ACP'))

WebUI.closeBrowser()

