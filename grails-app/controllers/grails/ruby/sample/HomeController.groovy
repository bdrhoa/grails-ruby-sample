package grails.ruby.sample

class HomeController {

    def index() { 
        //def fileReader = new FileReader("ruby_hello_world.rb");
        render ruby.eval("Math::PI");
    }
}
