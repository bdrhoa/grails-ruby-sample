package grails.ruby.sample

class HomeController {

    def hi() { 
        ruby.put('name', 'Bobby Warner')        
        render ruby.eval('sayHi($name)')
    }
    
    def bye() {
        ruby.put('name', 'John Smith')
        render ruby.eval('sayBye($name)')
    }
}
