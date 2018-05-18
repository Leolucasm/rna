/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redeneuraltrabalho;

import org.neuroph.core.NeuralNetwork;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.Perceptron;



/**
 *
 * @author 5106842
 */
public class RedeNeuralTrabalho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // create new perceptron network
    //    NeuralNetwork neuralNetwork = new Perceptron(2, 1);
        // create training set
    //    DataSet trainingSet =
     //    new DataSet(2, 1);
      // add training data to training set (logical OR function)
     //   trainingSet. addRow (new DataSetRow (new double[]{0, 0},
    //    new double[]{0}));
     //   trainingSet. addRow (new DataSetRow (new double[]{0, 1},
     //    new double[]{1}));
      //  trainingSet. addRow (new DataSetRow (new double[]{1, 0},
      //   new double[]{1}));
      //  trainingSet. addRow (new DataSetRow (new double[]{1, 1},
       //  new double[]{1}));
        // learn the training set
     //   neuralNetwork.learn(trainingSet);
        // save the trained network into file
       // neuralNetwork.save("or_perceptron.nnet");
        // load the saved network
        
       // NeuralNetwork neuralNetwork2 = NeuralNetwork.load("or_perceptron.nnet");
        NeuralNetwork neuralNetwork2 = NeuralNetwork.load("rnlis.nnet");
                
        // set network input
        neuralNetwork2.setInput(7.4,	2.8,	6.1,	1.9);
        // calculate network
        neuralNetwork2.calculate();
        // get network output
        double[] networkOutput = neuralNetwork2.getOutput();
        
        for (int i = 0 ; i<networkOutput.length;i++){
            System.out.println("Saída ["+i+"] : "+networkOutput[i]);
        }
    }
//4,8	3,1	1,6	0,2
//5,5	2,4	3,8	1,1
//7,4	2,8	6,1	1,9
//5,4	3,4	1,5	0,4


    
}
