import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Register {


    WebDriver driver;
    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @Before
    public void setupTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() throws IOException, InterruptedException {

        driver.get("https://www.utest.com/");

        WebElement signUp = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div[2]/div/a"));
        if(signUp.isDisplayed() == true){
            signUp.click();
            System.out.println("Se ingresó a la opción de registro");
            File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot1, new File("C:\\Users\\Andres Abella Mora\\Desktop\\Utest\\registro.png"));
        } else {
            System.out.println("No se encontró la opción de registro");
        }

        WebElement firstName = driver.findElement(By.id("firstName"));
        if(firstName.isDisplayed() == true){
            firstName.clear();
            firstName.sendKeys("New User FN");
            System.out.println("Se ingresó el nombre correctamente");
        } else {
            System.out.println("No se ingresó el nombre");

        }

        WebElement lastName = driver.findElement(By.id("lastName"));
        if(lastName.isDisplayed() == true){
            lastName.clear();
            lastName.sendKeys("New User LN");
            System.out.println("Se ingresó el apellido correctamente");
        } else {
            System.out.println("No se ingresó el apellido ");

        }

        WebElement emailAddress = driver.findElement(By.id("email"));
        if(emailAddress.isDisplayed() == true){
            emailAddress.clear();
            emailAddress.sendKeys("newuser@example.com");
            System.out.println("Se ingresó el email correctamente");
        } else {
            System.out.println("No se ingresó el email");

        }

        WebElement monthBirth = driver.findElement(By.id("birthMonth"));
        if(monthBirth.isDisplayed() == true){
            monthBirth.click();
            monthBirth.sendKeys("July");
            monthBirth.sendKeys(Keys.ENTER);
            System.out.println("Se ingresó el mes de nacimiento correctamente");
        } else {
            System.out.println("No se ingresó el mes de nacimiento ");

        }

        WebElement dayBirth = driver.findElement(By.id("birthDay"));
        if(dayBirth.isDisplayed() == true){
            dayBirth.click();
            dayBirth.sendKeys("31");
            dayBirth.sendKeys(Keys.ENTER);
            System.out.println("Se ingresó el día de nacimiento correctamente");
        } else {
            System.out.println("No se ingresó el día de nacimiento ");

        }

        WebElement yearBirth = driver.findElement(By.id("birthYear"));
        if(yearBirth.isDisplayed() == true){
            yearBirth.click();
            yearBirth.sendKeys("1990");
            yearBirth.sendKeys(Keys.ENTER);
            System.out.println("Se ingresó el año de nacimiento correctamente");
        } else {
            System.out.println("No se ingresó el año de nacimiento ");

        }

        WebElement languages = driver.findElement(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
        if(languages.isDisplayed() == true){
            languages.sendKeys("Spanish");
            languages.sendKeys(Keys.ENTER);
            File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot2, new File("C:\\Users\\Andres Abella Mora\\Desktop\\Utest\\PersonalInformation.png"));

            System.out.println("Se agregó un idioma");
        } else {
            System.out.println("No se agregó un idioma");

        }

        WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
        if(nextButton.isDisplayed() == true){
            nextButton.click();
            System.out.println("Se agregaron los datos personales correctamente");

        } else {
            System.out.println("No se agregaron los datos personales");

        }

        Thread.sleep(4000);

        WebElement cityAddress = driver.findElement(By.id("city"));
        if(cityAddress.isDisplayed() == true){
            cityAddress.clear();
            cityAddress.sendKeys("Bogotá");
            System.out.println("Se ingresó el email correctamente");
        } else {
            System.out.println("No se ingresó el email");

        }
        Thread.sleep(4000);

        WebElement zipCodeAddress = driver.findElement(By.id("zip"));
        if(zipCodeAddress.isDisplayed() == true){
            zipCodeAddress.clear();
            zipCodeAddress.sendKeys("111156");
            System.out.println("Se ingresó el zip code correctamente");
        } else {
            System.out.println("No se ingresó el zip code");

        }
        Thread.sleep(4000);

        /*WebElement countryAddress = driver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
        if(countryAddress.isDisplayed() == true){
            countryAddress.click();
            countryAddress.sendKeys("Colombia");
            countryAddress.sendKeys(Keys.ENTER);
            File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot3, new File("C:\\Users\\Andres Abella Mora\\Desktop\\Utest\\countryAddress.png"));
            System.out.println("Se ingresó el país correctamente");
        } else {
            System.out.println("No se ingresó el país");

        }*/

        WebElement secondButtonNext = driver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
        if(secondButtonNext.isDisplayed() == true){
            secondButtonNext.click();
         System.out.println("Se ingresó la información de residencia");
        } else {
            System.out.println("No se ingresó la información de residencia");

        }

        /*WebElement devicesComputer = driver.findElement(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
        if(devicesComputer.isDisplayed() == true){
            devicesComputer.click();
            devicesComputer.sendKeys("Windows");
            devicesComputer.sendKeys(Keys.ENTER);
            System.out.println("Se ingresó la información del Sistema Operativo correctamente");
        } else {
            System.out.println("No se ingresó la información del Sistema Operativo ");

        }
        Thread.sleep(3000);

        WebElement devicesVersion = driver.findElement(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]/span"));
        if(devicesVersion.isDisplayed() == true){
            devicesVersion.click();
            driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-35-0\"]/span/div")).click();
            System.out.println("Se ingresó la información de la versión del Sistema Operativo correctamente");
        } else {
            System.out.println("No se ingresó la información de la versión del Sistema Operativo ");

        }
        Thread.sleep(3000);


        WebElement devicesLanguage = driver.findElement(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
        if(devicesLanguage.isDisplayed() == true){
            devicesLanguage.click();
            devicesLanguage.sendKeys("Spanish");
            devicesLanguage.sendKeys(Keys.ENTER);
            System.out.println("Se ingresó la información del lenguaje del Sistema Operativo correctamente");
        } else {
            System.out.println("No se ingresó la información del lenguaje del Sistema Operativo");

        }*/
        Thread.sleep(5000);


        WebElement devicesMobile = driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
        if(devicesMobile.isSelected() == true){
            devicesMobile.click();
            driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-37-1\"]/span/div")).click();
            System.out.println("Se ingresó la información del dispositivo movil correctamente");
        } else {
            System.out.println("No se ingresó la información del dispositivo movil");

        }
        Thread.sleep(3000);


        WebElement devicesMobileModel = driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));
        if(devicesMobileModel.isSelected() == true){
            devicesMobileModel.click();
            driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-38-2\"]/span/div")).click();
            System.out.println("Se ingresó la información del modelo del dispositivo movil correctamente");
        } else {
            System.out.println("No se ingresó la información del modelo del dispositivo movil");

        }
        Thread.sleep(3000);


        WebElement devicesMobileSO = driver.findElement(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
        if(devicesMobileSO.isSelected() == true){
            devicesMobileSO.click();
            driver.findElement(By.xpath("//*[@id=\"ui-select-choices-row-39-2\"]/span/div")).click();
            File screenshot4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot4, new File("C:\\Users\\Andres Abella Mora\\Desktop\\Utest\\devices.png"));

            System.out.println("Se ingresó la información del sistema operativo del dispositivo movil correctamente");
        } else {
            System.out.println("No se ingresó la información del sistema operativo del dispositivo movil");

        }

        WebElement buttonNext3 = driver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
        if(buttonNext3.isDisplayed() == true){
            buttonNext3.click();
            System.out.println("Se ingresó la información de los dispositivos correctamente");
        } else {
            System.out.println("No se ingresó la información de los dispositivos");

        }

        WebElement createPass = driver.findElement(By.id("password"));
        if(createPass.isDisplayed() == true){
            createPass.sendKeys("Password.1234");
            System.out.println("Se creó la contraseña correctamente");
        } else {
            System.out.println("No se creó la contraseña");

        }

        WebElement confirmPass = driver.findElement(By.id("confirmPassword"));
        if(confirmPass.isDisplayed() == true){
            confirmPass.sendKeys("Password.1234");
            System.out.println("Se confirmó la contraseña correctamente");
        } else {
            System.out.println("No se confirmó la contraseña");

        }

        WebElement termsUse = driver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
        if(termsUse.isDisplayed() == true){
            termsUse.click();
            System.out.println("Se aceptaron términos y condiciones");
        } else {
            System.out.println("No se aceptaron términos y condiciones");

        }

        WebElement securityPolicy = driver.findElement(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
        if(securityPolicy.isDisplayed() == true){
            securityPolicy.click();
            File screenshot5 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot5, new File("C:\\Users\\Andres Abella Mora\\Desktop\\Utest\\lastStep.png"));

            System.out.println("Se aceptaron las políticas de seguridad");
        } else {
            System.out.println("No se aceptaron las políticas de seguridad");

        }

        WebElement completeButton = driver.findElement(By.xpath("//*[@id=\"laddaBtn\"]/span"));
        if(completeButton.isDisplayed() == true){
            completeButton.click();
            System.out.println("Se completó el diligenciamiento de los datos");
        } else {
            System.out.println("No se completó el diligenciamiento de los datos");

        }

    }
}
