package neural.model;

public class NeuralNetwork
{
	
	private double input[];
	private double weight[];
	private float desiredResult;
	private double learningRate;
	
	
	
	public NeuralNetwork() {
		
		desiredResult = 1;
		learningRate = 0.2;
		
		//inputVector = new double[4];
		//weightVector = new double[4];
		
		
		evaluateNeuralNetwork(input, weight);
	}
	
	public int evaluateNeuralNetwork(double[] inputVector, double[] weightVector) {
		int result = 0;
		
		return result;
	}
	public double evaluateNeuralNetError(double desired, double actual) {
		double error = (desired - actual);
		return error;
	}
	
	public void learn(double inputVector, double weightVector) {
		
	}
	
	public void train(int trails) {
		for(int runs = 0; runs < trails; runs++) {
			
		}
	}
	
	
}
