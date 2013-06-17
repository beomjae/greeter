class MegaGreeter:

	def __init__(self):
		self.names = "World"
	
	def say_hi(self):
		if self.names == "":
			print("...")
		elif type(self.names) in [list,tuple]:
			for name in self.names:
				print("Hello %s" % name)
		else:
			print("Hello %s" % self.names)

	def say_bye(self):
		if self.names == "":
			print("...")
		elif type(self.names) in [list,tuple]:
			print("Goodbye %s. Come back soon!" % ", ".join(self.names))
		else:
			print ("Goodbye %s. Come back soon!" % self.names)



if __name__ == "__main__" :
	mg = MegaGreeter()
	mg.say_hi()
	mg.say_bye()

	mg.names = "Zeke"
	mg.say_hi()
	mg.say_bye()

	mg.names = ["Albert", "Brenda", "Charles", "Dave", "Engelbert"]
	mg.say_hi()
	mg.say_bye()

	mg.names = ""
	mg.say_hi()
	mg.say_bye()