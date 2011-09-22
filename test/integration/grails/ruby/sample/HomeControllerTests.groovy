package grails.ruby.sample

import static org.junit.Assert.*
import org.junit.*

class HomeControllerTests extends GroovyTestCase {
    def dayOfWeek
    
    @Before
    void setUp() {
        dayOfWeek = new Date().format("EEEE")
        println dayOfWeek
    }
    
    void testHi() {
        def controller = new HomeController()
        controller.hi()
        
        assertEquals controller.response.contentAsString, "Hi Bobby! Today is $dayOfWeek.".toString()
    }
    
    void testBye() {        
        def controller = new HomeController()
        controller.bye()
        
        assertEquals controller.response.contentAsString, "Bye Bobby! Today is $dayOfWeek.".toString()
    } 
}
