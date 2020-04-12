package iamplus.stepDefinations;

import iamplus.frameworkcore.DriverFactory;
import iamplus.pageObjects.PageFactoryObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.concurrent.TimeUnit;

public class PopularMovies {

    public static PageFactoryObject pagefactory;

    @Given("I am on the HomePage")
    public void i_am_on_the_HomePage() throws Exception{

        DriverFactory driverFactory = DriverFactory.getInstance();
        driverFactory.setDriver("Mobile");
        pagefactory=new PageFactoryObject(driverFactory.getDriver());
        driverFactory.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("I click on the firstMovie Item from popular movie list")
    public void i_click_on_the_firstMovie_Item_from_popular_movie_list() {
        pagefactory.getPopularCinemasPage().verifyPopularMoviesPage();
    }

    @Then("I shall see Movie details of that first movie")
    public void i_shall_see_Movie_details_of_that_first_movie() {

        pagefactory.getMovieDetailsPage().verifyMovieContentDetails();
    }



}
