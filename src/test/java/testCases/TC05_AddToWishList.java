package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CategoryPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductPage;

import testBase.BaseClass;
import utilities.RetryAnalyzer;

public class TC05_AddToWishList extends BaseClass {

    @Test(
        groups = {"regression"},
        retryAnalyzer = utilities.RetryAnalyzer.class
    )
    public void testAddToWishList() {

    	log.info("========== Add To Wishlist Test Started ==========");

        try {

            // Step 1: Navigate to application home page
        	log.debug("Navigating to application home page");

            getDriver().get(p.getProperty("appURL"));

            log.info("Application home page loaded successfully");

            // Step 2: Initialize HomePage
            log.debug("Initializing HomePage object");

            HomePage hp = new HomePage(getDriver());

            // Step 3: Navigate to Login Page
            log.debug("Clicking My Account menu");

            hp.clickMyAccount();

            log.info("My Account menu clicked successfully");

            log.debug("Navigating to Login page");

            hp.goToLogin();

            log.info("Login page opened successfully");

            // Step 4: Initialize LoginPage
            log.debug("Initializing LoginPage object");

            LoginPage lp = new LoginPage(getDriver());

            // Step 5: Enter Login Credentials
            log.debug("Entering email address");

            lp.setEmail("parurajeshmail@gmail.com");

            log.info("Email entered successfully");

            log.debug("Entering password");

            lp.setPwd("Test12");

            log.info("Password entered successfully");

            // Step 6: Click Login
            log.debug("Clicking Login button");

            lp.clickLogin();

            log.info("Login button clicked successfully");

            // Step 7: Initialize CategoryPage
            log.debug("Initializing CategoryPage object");

            CategoryPage cp = new CategoryPage(getDriver());

            // Step 8: Navigate to Laptops & Notebooks
            log.debug("Clicking Laptops & Notebooks category");

            cp.clickLaptopsAndNotebooks();

            log.info("Laptops & Notebooks category clicked");

            // Step 9: Click Show All
            log.debug("Clicking Show All Laptops & Notebooks");

            cp.clickShowAll();

            log.info("All laptops and notebooks displayed");

            // Step 10: Wait for product listing
            log.debug("Waiting 500 milliseconds for product listing");

            Thread.sleep(500);

            log.debug("Wait completed successfully");

            // Step 11: Select HP Product
            log.debug("Selecting HP product");

            cp.selectHPProduct();

            log.info("HP product selected successfully");

            // Step 12: Initialize ProductPage
            log.debug("Initializing ProductPage object");

            ProductPage pp = new ProductPage(getDriver());

            // Step 13: Add Product to Wishlist
            log.debug("Clicking Add to Wishlist button");

            pp.addToWishlist();

            log.info("Add to Wishlist button clicked successfully");

            // Step 14: Verify Wishlist Success Message
            log.debug("Verifying wishlist success message");

            try {

                boolean status = pp.isSuccessMessageDisplayed();

                log.debug(
                    "Wishlist success message status: {}",
                    status
                );

                Assert.assertTrue(
                    status,
                    "Wishlist message not shown."
                );

                log.info("Wishlist verification PASSED");

            } catch (AssertionError e) {

            	log.error(
                    "Wishlist verification assertion FAILED",
                    e
                );

                // Rethrow to trigger RetryAnalyzer
                throw e;
            }

            log.info("Add To Wishlist Test PASSED");

        } catch (AssertionError e) {

            // Assertion failure already logged above.
            // Rethrow to allow RetryAnalyzer to execute.
            throw e;

        } catch (InterruptedException e) {

        	log.error(
                "Add To Wishlist Test interrupted",
                e
            );

            Thread.currentThread().interrupt();

            throw new RuntimeException(
                "Test execution interrupted", e
            );

        } catch (Exception e) {

        	log.error(
                "Add To Wishlist Test FAILED due to exception",
                e
            );

            throw e;

        } finally {

        	log.info(
                "========== Add To Wishlist Test Finished =========="
            );
        }
    }
}