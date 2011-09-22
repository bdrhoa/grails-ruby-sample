def sayHi(name)
    time = Time.new
    day = time.strftime("%A")
    "Hello #{name}! Today is #{day}."
end

def sayBye(name)
    time = Time.new
    day = time.strftime("%A")
    "Goodbye #{name}! Today is #{day}."
end
