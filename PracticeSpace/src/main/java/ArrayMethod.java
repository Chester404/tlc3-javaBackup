public class ArrayMethod {

    public static void main(String []args){

        int[] values = new int[5];

        for(int i=0;i < values.length; i++){
            values[i] = i * 2;
        }
        double[] doubleValues = toDouble(values);

        System.out.println(doubleValues[4]);
    }

    public static double[] toDouble(int[] values){

        double[] result = new double[values.length];
        for(int i=0; i < values.length; i++){
            result[i] = (double) values[i];
        }
        return  result;
    }
}
