package grails.ruby.sample

class HomeController {

    def hi() { 
        ruby.put('name', 'Bobby Warner')
        ruby.put('greeting', 'Hi')
        render ruby.eval('greet($name, $greeting)')
    }
    
    def bye() {
        ruby.put('name', 'Bobby Warner')
        ruby.put('greeting', 'Bye')
        render ruby.eval('greet($name, $greeting)')
    }
}
