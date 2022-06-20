package day22_arrayList.practiceTasks;

public class Replace_ReplaceAll_Insert_Swap_Methods {

    public static void main(String[] args) {


    }

    // Replace

    public static int[] replace(int[] arr, int index, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static double[] replace(double[] arr, int index, double newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static char[] replace(char[] arr, int index, char newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static String[] replace(String[] arr, int index, String newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                arr[i] = newElement;
            }
        }
        return arr;
    }


    //------------------------------------------------

    // ReplaceAll

    public static int[] replaceAll(int[] arr, int oldElement, int newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static double[] replaceAll(double[] arr, double oldElement, double newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static char[] replaceAll(char[] arr, char oldElement, char newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    public static String[] replaceAll(String[] arr, String oldElement, String newElement) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldElement) {
                arr[i] = newElement;
            }
        }
        return arr;
    }

    //----------------------------------------
    // Insert

    public static int[] insert(int[] arr, int index, int element) {
        int[] result = new int[arr.length + 1];
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                temp = arr[i];
                result[i] = element;
                result[i + 1] = temp;
            } else {
                if (result[i] != 0) {
                    temp = arr[i];
                    result[i + 1] = temp;
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }

    public static double[] insert(double[] arr, int index, double element) {
        double[] result = new double[arr.length + 1];
        double temp;

        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                temp = arr[i];
                result[i] = element;
                result[i + 1] = temp;
            } else {
                if (result[i] != 0) {
                    temp = arr[i];
                    result[i + 1] = temp;
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }

    public static char[] insert(char[] arr, int index, char element) {
        char[] result = new char[arr.length + 1];
        char temp;

        for (int i = 0; i < result.length - 1; i++) {
            if (i == index) {
                temp = arr[i];
                result[i] = element;
                result[i + 1] = temp;
            } else {
                if (result[i] != 0) {
                    temp = arr[i];
                    result[i + 1] = temp;
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }

    public static String[] insert(String[] arr, int index, String element) {
        String[] result = new String[arr.length + 1];
        String temp;

        for (int i = 0; i < result.length - 1; i++) {
            if (i == index) {
                temp = arr[i];
                result[i] = element;
                result[i + 1] = temp;
            } else {
                if (result[i] != null) {
                    temp = arr[i];
                    result[i + 1] = temp;
                } else {
                    result[i] = arr[i];
                }
            }
        }
        return result;
    }


    // Swap

    public static int[] swap(int[] arr, int i, int j) {
        int temp;
        for (int k = 0; k < arr.length; k++) {
            if (k == i) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static double[] swap(double[] arr, int i, int j) {
        double temp;
        for (int k = 0; k < arr.length; k++) {
            if (k == i) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static char[] swap(char[] arr, int i, int j) {
        char temp;
        for (int k = 0; k < arr.length; k++) {
            if (k == i) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static String[] swap(String[] arr, int i, int j) {
        String temp;
        for (int k = 0; k < arr.length; k++) {
            if (k == i) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }


}
