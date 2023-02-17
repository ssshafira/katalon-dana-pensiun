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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sequis.co.id/')

WebUI.click(findTestObject('Close Footer'))

WebUI.click(findTestObject('Object Repository/Homepage - Pilih Kebutuhan'))

WebUI.click(findTestObject('Object Repository/Homepage - Pilih Dana Pensiun'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pilih Kebutuhan'), '31', true)

WebUI.click(findTestObject('Object Repository/Pilih Dana Pensiun'))

WebUI.click(findTestObject('Object Repository/button_Selanjutnya (Halaman Awal)'))

WebUI.click(findTestObject('Object Repository/select Jenis Kelamin'))

WebUI.click(findTestObject('Pilih Jenis Kelamin'))

WebUI.click(findTestObject('Object Repository/dd Usia'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pilih Usia (17-25 tahun)'), '17_25', true)

WebUI.click(findTestObject('Object Repository/Pilih Belum Menikah'))

WebUI.click(findTestObject('button_Selanjutnya (Halaman Identitas)'))

WebUI.click(findTestObject('dd Pilih Pengeluaran'))

WebUI.click(findTestObject('Object Repository/Pilih Pengeluaran 5-10 juta'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pilih Pengeluaran'), '5_10', true)

WebUI.click(findTestObject('Object Repository/dd Pilih Tabungan'))

WebUI.click(findTestObject('Object Repository/Pilih Tabungan 1-2 juta'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pilih Tabungan'), '1_2', true)

WebUI.click(findTestObject('dd Pilih Premi'))

WebUI.click(findTestObject('Object Repository/Pilih Premi kurang dari 1 juta'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pilih Premi'), 'LT_1', true)

WebUI.click(findTestObject('Object Repository/button_Selanjutnya (Keuangan)'))

WebUI.click(findTestObject('Object Repository/a_Dapatkan Hasil'))

