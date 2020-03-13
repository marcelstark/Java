package BasicExercises;

public class BasicExercises {
	
//Ejercicio 1
	public void printer(int limite) {
		System.out.println("Numeros del 1 al " + limite);
		for (int i = 1; i <= limite; i++){
			System.out.println(i);
			}
		}
//Ejercicio 2	
    public void printerOdd(int limite) {
    	System.out.println("Numeros Impares");
    	for (int i = 1; i <= limite; i++){
    		if (i % 2 != 0) {
    			System.out.println(i);
    			}
    		}
    	}

//Ejercicio 3
    public void printerSum(int limite) {
    	System.out.println("Suma de Numeros");
        int sum = 0;
        for (int i = 0; i <= limite; i++){
        	sum += i;
            System.out.println("Nuevo numero: " + i + " Suma: " + sum);
            }
        }

//Ejercicio 4
    public void printerArray(int[] array) {
    	System.out.println("Numeros de un Arreglo");
    	for (int i = 0; i < array.length; i++){
    		System.out.println(array[i]);
    		}
    	}

//Ejercicio 5
    public void printerMax(int[] array) {
    	int val = array[0];
        for (int i = 0;i < array.length; i++){
        	if (array[i] > val) {
            	val = array[i];
                }   
            }
        System.out.println("El Numero mas Alto: " + val);
        }

//Ejercicio 6
    public void printerAverage(int[] array) {
        int result = 0;
        for (int i = 0;i < array.length; i++){
            result += array[i];
        }
        result = result / array.length;
        System.out.println("El promedio del Arreglo: " + result);
    }

//Ejercicio 7
    public void printerArrayOdd(int limite) {
        ArrayList<Integer> almacen = new ArrayList<Integer>();
        for (int i = 1;i <= limite; i++){
            almacen.add(i);
        }
        ArrayList<Integer> impares = new ArrayList<Integer>();
        for (int e = 0;e < almacen.size(); e++){
            if (almacen.get(e) % 2 != 0) {
                impares.add(almacen.get(e)); 
            }
        }
        System.out.println(impares);
    }
    
//Ejercicio 8
    public void printerMaxY(int[] array, int y) {
        int count = 0;
        for (int i = 0;i < array.length; i++){
            if (array[i] > y) {
                count += 1;
            }
        }
        System.out.println("Cantidad mayores que " + y + ": " + count);
    }
    
//Ejercicio 9
    public void printerSquare(int[] array) {
        System.out.println("Los numeros al Cuadrado Son:");
        ArrayList<Integer> cuadrado = new ArrayList<Integer>();
        for (int i = 0;i < array.length; i++){
            cuadrado.add(array[i] * array[i]);
        }
        System.out.println(cuadrado);
    }
//Ejercicio 10
    public void printerNoNegativo(int[] array) {
        System.out.println("Se Transformaron los valores negativos a 0");
        for (int i = 0;i < array.length; i++){
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
//Ejercicio 11
    public void printerMinMaxAvrg(int[] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        System.out.println("Maximo, Minimo, Promedio");
        int max = array[0];
        int min = array[0];
        int avrg = 0;
        for (int i = 0;i < array.length; i++){
            avrg += array[i];
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];   
            }   
        }
        avrg = avrg / array.length;
        result.add(max);
        result.add(min);
        result.add(avrg);
        System.out.println(result);
    }
//Ejercicio 12
    public void printerFinal(int[] array) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        System.out.println("Cambiando Valores de Arreglo");
        for (int i = 1;i < array.length; i++){
            result.add(array[i]);
        }
        result.add(0);
        System.out.println(result);
    }
}
