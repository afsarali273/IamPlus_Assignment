package iamplus.stepDefinations;

import iamplus.pageObjects.PageFactoryObject;
import io.cucumber.java.en.When;

public class UpComingMovie {

    PageFactoryObject factory = PopularMovies.pagefactory;

    @When("I click on the firstMovie Item from upcoming  movie list")
    public void i_click_on_the_firstMovie_Item_from_upcoming_movie_list() {

        factory.getUpcomingCinemasPage().verifyUpComingMoviesPage();
    }



}
