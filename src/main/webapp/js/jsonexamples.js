student = {

	name : "Pesho",
	smoker : false,
	age : 22,
	savings : 123123,
	lotteryNumbers : [ 1, 4, 12, 22, 23, 31],
	dateOfBirth : new Date("2001-09-03"),
	address : {
		country : "Bulgaria",
		city : "Sofia"
	},
	someNaN : NaN,
	somePositiveInfinity : Infinity,
	someNegativeInfinity : -Infinity,
	someNullProp : null,
	someUndefinedProp : undefined
}

// s = JSON.stringify(student)
// JSON.parse(s)
// try to insert a null element into the array and see what happens



fancyStudent = {

		name : "Pesho",
		smoker : false,
		age : 22,
		savings : 123123,
		toJSON: function() {
			return "I am so fancy!"
		}
	}
//JSON.stringify(fancyStudent)