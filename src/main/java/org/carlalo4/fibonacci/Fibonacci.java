package org.carlalo4.fibonacci;
/**
 * Class providing a method that computes the fibonacci number of a position given.
 *
 * @author Carla Lorido Osuna
 */

public class Fibonacci {

    public int compute(int position){
        if(position < 0){
            throw new RuntimeException("The position given is negative: "+ position);
        }
        int solution;

        if (position==0) {
            solution= 0;
        }
        else if (position==1 || position ==2 ){
            solution = 1;
        }
        else{
           solution = compute(position - 1) + compute(position - 2);
        }
        return solution;
    }

}
