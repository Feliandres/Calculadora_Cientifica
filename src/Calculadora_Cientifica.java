import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora_Cientifica {
    private JPanel Cabecera;
    private JPanel Botonera;
    private JButton alCuboBTN;
    private JButton a4BTN;
    private JButton raiz_N_BTN;
    private JButton cosBTN;
    private JButton cos1BTN;
    private JButton sinBTN;
    private JButton tanBTN;
    private JButton MC_BTN;
    private JButton pi_N_BTN;
    private JButton eBTN;
    private JButton a_la_menos_1_BTN;
    private JButton sin1BTN;
    private JButton tan1BTN;
    private JButton a_la_N_BTN;
    private JButton a7BTN;
    private JButton borrarBTN;
    private JPanel Principal;
    private JRadioButton sexagesBTN;
    private JRadioButton radianesBTN;
    private JButton nBTN;
    private JButton raizCubicaBTN;
    private JButton alCuadradoBTN;
    private JButton a1BTN;
    private JButton a_la_10_BTN;
    private JButton EXPButton;
    private JButton logBTN;
    private JButton MS_BTN;
    private JButton Mma_BTN;
    private JButton Mme_BTN;
    private JButton C_BTN;
    private JButton mas_menos_BTN;
    private JButton raiz_BTN;
    private JButton a9BTN;
    private JButton divisionBTN;
    private JButton porcentajeBTN;
    private JButton a6BTN;
    private JButton multiplicacionBTN;
    private JButton inversaBTN;
    private JButton a3BTN;
    private JButton restaBTN;
    private JButton igualBTN;
    private JButton MR_BTN;
    private JButton CE_BTN;
    private JButton a8BTN;
    private JButton a5BTN;
    private JButton a2BTN;
    private JButton a0BTN;
    private JButton puntoBTN;
    private JButton sumaBTN;
    private JLabel resultadoPrincipalTxt;
    private JLabel ResultadoSecundarioTxt;
    private JLabel MemoriaTxt;

    private boolean igual, inicio = true, operacion1, operacion2;
    private double a,b,c, cos, acos, sin, asin, tan, atan, memoria = 0, resultado, valor1, valor2;
    private String cadena, funciones, tipoOperaciones;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Cientifica");
        frame.setContentPane(new Calculadora_Cientifica().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,400);
        frame.setVisible(true);
        ImageIcon logo = new ImageIcon("D:\\Java EPN\\Calculadora_Cientifica\\src\\calcular.png");
        frame.setIconImage(logo.getImage());

    }

    public Calculadora_Cientifica() {

        MemoriaTxt.setVisible(false);

        // INICIO BOTONES DEL 0 AL 9
        a0BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("0");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"0");
                }
            }
        });
        a1BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("1");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"1");
                }
            }
        });
        a2BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("2");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"2");
                }
            }
        });
        a3BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("3");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"3");
                }
            }
        });
        a4BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("4");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"4");
                }
            }
        });
        a5BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("5");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"5");
                }
            }
        });
        a6BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("6");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"6");
                }
            }
        });
        a7BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("7");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"7");
                }
            }
        });
        a8BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("8");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"8");
                }
            }
        });
        a9BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(inicio == true) {
                    resultadoPrincipalTxt.setText("");
                    resultadoPrincipalTxt.setText("9");
                    inicio = false;
                } else {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+"9");
                }
            }
        });

        // INICIO  Boton con la funcion punto decimal
        puntoBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(resultadoPrincipalTxt.getText().contains(".")){

                }else{
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText()+".");
                    inicio = false;
                }
            }
        });

        // INICIO  Boton suma
        sumaBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("");
                    ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" + ");
                    operacion1 = false;
                }else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("");
                        ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" + ");
                        operacion2 = false;
                    }else {
                        ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" + ");
                        Operaciones(resultado, valor2);
                    }

                }
                tipoOperaciones = "+";
            }
        });

        // INICIO  Boton resta
        restaBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("");
                    ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" - ");
                    operacion1 = false;
                }else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("");
                        ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" - ");
                        operacion2 = false;
                    }else {
                        ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" - ");
                        Operaciones(resultado, valor2);
                    }

                }
                tipoOperaciones = "-";
            }
        });

        // INICIO  Boton multiplicacion
        multiplicacionBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("");
                    ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" x ");
                    operacion1 = false;
                }else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("");
                        ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" x ");
                        operacion2 = false;
                    }else {
                        ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" x ");
                        Operaciones(resultado, valor2);
                    }

                }
                tipoOperaciones = "*";
            }
        });

        // INICIO  Boton division
        divisionBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                igual = true;
                inicio = true;
                // condicion para la variable operacion1
                if (operacion1 = true) {
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("");
                    ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" / ");
                    operacion1 = false;
                }else {
                    // condicion para la variable operacion2
                    if (operacion2 = true) {
                        valor2 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("");
                        ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" / ");
                        operacion2 = false;
                    }else {
                        ResultadoSecundarioTxt.setText(resultadoPrincipalTxt.getText()+" / ");
                        Operaciones(resultado, valor2);
                    }

                }
                tipoOperaciones = "/";
            }
        });

        // INICIO  Boton igual
        igualBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio = true;
                operacion1 = true;
                if (igual = true) {
                    if (tipoOperaciones == null) {

                    }else{
                        valor2 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText(ResultadoSecundarioTxt.getText()+resultadoPrincipalTxt.getText());
                        Operaciones(valor1,valor2);
                        igual = false;
                    }
                } else {
                    ResultadoSecundarioTxt.setText("");
                    Operaciones(valor1,valor2);
                }
            }
        });

        // INICIO  Boton raiz Cuadrada
        raiz_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                if (valor1 >= 0){
                    ResultadoSecundarioTxt.setText("sqrt( " +valor1+ " )");
                    resultadoPrincipalTxt.setText(Math.sqrt(valor1)+" ");
                } else {
                    resultadoPrincipalTxt.setText("Error ");
                }
            }
        });

        // INICIO  Boton raiz Cuadrada
        porcentajeBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor2 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText(ResultadoSecundarioTxt.getText()+resultadoPrincipalTxt.getText());
                resultadoPrincipalTxt.setText((valor1*valor2)/100 + " ");
                igual = true;
            }
        });

        // INICIO  Boton funcion reciproca
        inversaBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText("reciproc(" +valor1+ " )");
                resultadoPrincipalTxt.setText(1/valor1 + " ");
            }
        });

        // INICIO  Boton cambio de signo
        mas_menos_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = 0, num2, num3;
                num2 = Double.parseDouble(resultadoPrincipalTxt.getText());
                num3 = num1 - num2;
                resultadoPrincipalTxt.setText(num3 + " ");
            }
        });

        // INICIO  Boton Clear
        C_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoPrincipalTxt.setText("0");
                ResultadoSecundarioTxt.setText("");
                inicio = true;
                funciones = "";
                operacion1 = true;
                operacion2 = true;
                igual = true;
                valor1 = 0;
                valor2 = 0;
                resultado = 0;
            }
        });

        // INICIO  Boton C
        CE_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoPrincipalTxt.setText("0");
                ResultadoSecundarioTxt.setText("");
                inicio = true;
                funciones = "";
            }
        });

        // INICIO  Boton RETROCEDER
        borrarBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (resultadoPrincipalTxt.getText().length() > 0) {
                    resultadoPrincipalTxt.setText(resultadoPrincipalTxt.getText().substring(0,resultadoPrincipalTxt.getText().length()-1));
                    if (resultadoPrincipalTxt.getText().length() == 0){
                        resultadoPrincipalTxt.setText("0");
                        inicio = true;
                    }
                }
            }
        });

        // FUNCIONES TRIGONOMETRICAS

        // INICIO  Boton Coseno
        cosBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "cos";
                Trigonometria();
            }
        });

        // INICIO  Boton Seno
        sinBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "sin";
                Trigonometria();
            }
        });

        // INICIO  Boton Tangente
        tanBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "tan";
                Trigonometria();
            }
        });

        // INICIO  Boton Inverso Coseno
        cos1BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "acos";
                Trigonometria();
            }
        });

        // INICIO  Boton  Inverso Seno
        sin1BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "asin";
                Trigonometria();
            }
        });

        // INICIO  Boton Inverso Tangente
        tan1BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                funciones = "atan";
                Trigonometria();
            }
        });

        // INICIO  Boton que devuelve el valor de PI
        pi_N_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultadoSecundarioTxt.setText("PI ");
                resultadoPrincipalTxt.setText(Math.PI+" ");
            }
        });

        // INICIO  Boton que eleva x a la -1
        a_la_menos_1_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText(valor1+" ^-1 ");
                resultadoPrincipalTxt.setText(Math.pow(valor1,-1)+ " ");
            }
        });

        // INICIO  Boton que eleva numero a x Potencia
        a_la_N_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio = true;
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText(valor1+" ^ ");
                tipoOperaciones = "potencia";
                operacion1 = false;
                igual = true;

            }
        });

        // INICIO  Boton que saca la raiz x de un numero
        raiz_N_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inicio = true;
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText(valor1 + " yroot ");
                tipoOperaciones = "raizx";
                operacion1 = false;
                igual = true;

            }
        });

        // INICIO  Boton que eleva un numero al cubo
        alCuboBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText("cube( " +valor1+ " )");
                resultadoPrincipalTxt.setText(Math.pow(valor1,3)+" ");

            }
        });

        // INICIO  Boton que devuelve el factorial
        nBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = 1;
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText("fact( " +valor1+" )");
                for (b = 1; b <= valor1; b++){
                    a = a * b;
                }
                resultadoPrincipalTxt.setText(a + " ");
            }
        });

        // INICIO  Boton que devuelve el valor de e
        eBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ResultadoSecundarioTxt.setText("E ");
                resultadoPrincipalTxt.setText(Math.E + " ");
            }
        });

        // INICIO  Boton de raiz cubica
        raizCubicaBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                a = 1;
                b = 3;
                c = a/b;
                ResultadoSecundarioTxt.setText("cuberoot( " +valor1+ ") ");
                resultadoPrincipalTxt.setText(Math.pow(valor1,c)+" ");
            }
        });

        // INICIO  Boton que eleva al cuadrado
        alCuadradoBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText("sqr( " +valor1+ ") ");
                resultadoPrincipalTxt.setText(Math.pow(valor1,2)+" ");

            }
        });

        // INICIO  Boton que eleva a la enesima potencia
        a_la_10_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText("pow_ten( " +valor1+ ") ");
                resultadoPrincipalTxt.setText(Math.pow(10,valor1)+" ");

            }
        });

        // INICIO  Boton de la exponenciacion neperiana
        EXPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                resultadoPrincipalTxt.setText(Math.exp(valor1)+" ");
            }
        });

        // INICIO  Boton del logaritmo
        logBTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                ResultadoSecundarioTxt.setText("log( " +valor1+ ") ");
                resultadoPrincipalTxt.setText(Math.log(valor1)+" ");
            }
        });

        // INICIO  Boton con la funcion MC
        MC_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memoria = 0;
                MemoriaTxt.setVisible(false);
            }
        });

        // INICIO  Boton con la funcion MR
        MR_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultadoPrincipalTxt.setText(memoria + " ");
            }
        });

        // INICIO  Boton con la funcion MS
        MS_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memoria = Double.parseDouble(resultadoPrincipalTxt.getText());
                MemoriaTxt.setVisible(true);
            }
        });

        // INICIO  Boton con la funcion M+
        Mma_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memoria = memoria + Double.parseDouble(resultadoPrincipalTxt.getText());
                MemoriaTxt.setVisible(true);
            }
        });

        // INICIO  Boton con la funcion M-
        Mme_BTN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                memoria = memoria - Double.parseDouble(resultadoPrincipalTxt.getText());
                MemoriaTxt.setVisible(true);
            }
        });
    }
    private void Operaciones(double valor1, double valor2){
        switch (tipoOperaciones){
            // Case con las funciones de sumar
            case "+":
                resultado = valor1 + valor2;
                resultadoPrincipalTxt.setText(resultado+"");
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                break;
            // Case con las funciones de restar
            case "-":
                resultado = valor1 - valor2;
                resultadoPrincipalTxt.setText(resultado+"");
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                break;
            // Case con las funciones de multiplicar
            case "*":
                resultado = valor1 * valor2;
                resultadoPrincipalTxt.setText(resultado+"");
                valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                break;
            // Case con las funciones de dividir
            case "/":
                if (valor2 == 0){
                    resultadoPrincipalTxt.setText("Error ");
                    break;
                } else {
                    resultado = valor1 / valor2;
                    resultadoPrincipalTxt.setText(resultado + "");
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    break;
                }

            // Case con las funciones de elevar potencia
            case "potencia":
                resultado = Math.pow(valor1,valor2);
                resultadoPrincipalTxt.setText(resultado + "");
                break;

            // Case con las funciones de raiz de un numero x
            case "raizx":
                if (valor2 <=0) {
                    resultadoPrincipalTxt.setText("Error ");
                    break;
                } else {
                    ResultadoSecundarioTxt.setText(valor2 + " yroot");
                    a = 1;
                    c = a/valor2;
                    resultadoPrincipalTxt.setText(Math.pow(valor1,c)+" ");
                    break;
                }

        }

    }
    private void Trigonometria(){
        if(sexagesBTN.isSelected()){
            switch (funciones) {
                // Seno
                case "sin":
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("sin( "+valor1+" )");
                    sin = Math.sin(Math.PI*(valor1)/180);
                    resultadoPrincipalTxt.setText(sin+" ");
                    break;
                // Seno Inverso
                case "asin":
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("asin( "+valor1+" )");
                    asin = Math.asin(((valor1)*180)/Math.PI);
                    resultadoPrincipalTxt.setText(asin+" ");
                    break;
                // Coseno
                case "cos":
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("cos( "+valor1+" )");
                    cos = Math.cos(Math.PI*(valor1)/180);
                    resultadoPrincipalTxt.setText(cos+" ");
                    break;
                // Coseno Inverso
                case "acos":
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("acos( "+valor1+" )");
                    acos = Math.acos(((valor1)*180)/Math.PI);
                    resultadoPrincipalTxt.setText(acos+" ");
                    break;
                // Tangente
                case "tan":
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("tan( "+valor1+" )");
                    tan = Math.tan(Math.PI*(valor1)/180);
                    resultadoPrincipalTxt.setText(tan+" ");
                    break;
                // Seno Inverso
                case "atan":
                    valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                    ResultadoSecundarioTxt.setText("atan( "+valor1+" )");
                    atan = Math.atan(((valor1)*180)/Math.PI);
                    resultadoPrincipalTxt.setText(atan+" ");
                    break;
            }
        }else {
            if(radianesBTN.isSelected()){
                switch (funciones) {
                    // Seno
                    case "sin":
                        valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("sin_r( "+valor1+" )");
                        sin = Math.sin(valor1);
                        resultadoPrincipalTxt.setText(sin+" ");
                        break;
                    // Seno Inverso
                    case "asin":
                        valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("asin_r( "+valor1+" )");
                        asin = Math.asin(valor1);
                        resultadoPrincipalTxt.setText(asin+" ");
                        break;
                    // Coseno
                    case "cos":
                        valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("cos_r( "+valor1+" )");
                        cos = Math.cos(valor1);
                        resultadoPrincipalTxt.setText(cos+" ");
                        break;
                    // Coseno Inverso
                    case "acos":
                        valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("acos_r( "+valor1+" )");
                        acos = Math.acos(valor1);
                        resultadoPrincipalTxt.setText(acos+" ");
                        break;
                    // Tangente
                    case "tan":
                        valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("tan_r( "+valor1+" )");
                        tan = Math.tan(valor1);
                        resultadoPrincipalTxt.setText(tan+" ");
                        break;
                    // Seno Inverso
                    case "atan":
                        valor1 = Double.parseDouble(resultadoPrincipalTxt.getText());
                        ResultadoSecundarioTxt.setText("atan_r( "+valor1+" )");
                        atan = Math.atan(valor1);
                        resultadoPrincipalTxt.setText(atan+" ");
                        break;
                }
            }
        }
    }

}