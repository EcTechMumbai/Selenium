package Transformation;

import cucumber.api.Transformer;

public class SalaryCountTransformer extends Transformer<Integer> {

	@Override
	public Integer transform(String salary) {
		// TODO Auto-generated method stub
		return salary.length();
	}

}
