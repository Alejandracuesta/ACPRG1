class Mapa {
    public static void main(String[] args) {
        int[][] matriz = {
            {7,7,7,7,7,7,7,7,7,7,3,3,3,0,0,0,6,6,6,7,7,7,7},
            {0,0,7,7,7,7,7,7,7,7,6,5,0,5,0,0,4,4,4,0,0,0,0},
            {1,1,1,1,0,0,0,0,0,2,2,0,0,8,8,8,8,8,0,0,1,1,1},
            {0,8,8,8,8,9,9,9,0,0,0,3,3,3,3,0,2,2,2,3,3,3,3},
            {0,0,0,5,5,5,5,4,3,0,0,4,0,4,4,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,2,2,2,0,0,0,5,5,5,5,5,5,5},
            {0,0,0,1,1,1,2,2,2,2,2,0,0,0,0,0,9,9,9,8,8,9,9},
            {1,1,1,1,2,2,2,2,3,3,0,0,2,2,0,2,0,0,0,0,0,0,0},
            {7,7,7,7,7,7,7,7,7,7,3,3,3,0,0,0,2,2,2,0,0,1,0},
            {0,0,7,7,7,7,7,7,7,7,6,5,0,5,0,0,6,1,1,0,0,2,2},
            {1,1,1,1,0,0,0,0,0,2,2,0,0,8,8,8,6,9,9,9,9,6,0},
            {0,8,8,8,8,9,9,9,0,0,0,3,3,3,3,0,6,3,2,3,2,3,2},
            {0,0,0,5,5,5,5,4,3,0,0,4,0,4,4,0,6,5,5,5,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,2,2,2,0,0,0,6,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,2,2,2,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0},
            {1,1,1,1,2,2,2,2,3,3,0,0,2,2,0,2,2,2,2,2,1,1,1},
            {7,7,7,7,7,7,7,7,7,7,3,3,3,0,0,0,6,7,7,7,7,7,7},
            {0,0,7,7,7,7,7,7,7,7,6,5,0,5,0,0,0,0,0,0,0,7,7},
            {1,1,1,1,0,0,0,0,0,2,2,0,0,8,8,8,0,0,0,0,0,0,7},
            {0,8,8,8,8,9,9,9,0,0,0,3,3,3,3,0,3,3,2,1,1,1,1},
            {0,0,0,5,5,5,5,4,3,0,0,4,0,4,4,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,2,2,2,0,0,0,5,5,6,7,6,1,9},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
            imprime(matriz);
    }
        static void imprime(int[][] matriz){
            for(int fila=0;fila<matriz.length;fila++){
                for(int columna=0;columna<matriz[fila].length;columna++){
                    System.out.print(parse(matriz[fila][columna]) + " ");
                }
                System.out.println();
            }
        }

        static String parse(int valor){
            return switch(valor) {
                case 0 -> "   ";
                case 1 -> "[#]";
                case 2 -> " · ";
                case 3 -> "- -";
                case 4 -> "'''";
                case 5 -> ":::";
                case 6 -> ", '";
                case 7 -> "/^\\";
                case 8 -> "^Y^";
                case 9  ->":|:";
                default -> "???";
            };
           
        }
    
}