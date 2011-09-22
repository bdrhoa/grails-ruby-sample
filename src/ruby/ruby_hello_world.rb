class RubyHelloWorld
    def create_greeting(name, greeting)
        time = Time.new
        day = time.strftime("%A")
        "#{greeting} #{name}! Today is #{day}."
    end
end

def greet(name, greeting)
    hello_world = RubyHelloWorld.new
    hello_world.create_greeting(name, greeting)
end
