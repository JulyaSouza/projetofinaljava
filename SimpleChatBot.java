import java.util.Scanner;


public class SimpleChatBot {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, bem vindo(a) ao Pet Shop Snoopy Dog! Qual seu nome?");
        String name = scanner.nextLine();
        System.out.println("\n Olá " + name + " , em que posso ajudar? Responda com o numero da opção desejada:");
        System.out.println(" 1- Banhos \n 2- Sugestões");
        int var = scanner.nextInt();


        double valor = 0;
       
        if (var == 1) {
            System.out.println(
                    "Esses são os tipos de banhos para seu pet. Responda com o número da opção desejada: \n 1-Banho Simples \n 2-Banho e tosa geral \n 3-Hidratação \n 4-Banho e tosa higiênica");
            int res = scanner.nextInt();

            if (res == 1) {

                System.out.println("Aqui estão os valores a partir do porte de seu pet e do tipo de banho escolhido. Responda com o número da opção desejada: \n 1-Pequeno R$ 20,00 \n 2-Médio R$ 30,00 \n 3-Grande R$ 40,00");
                Integer ace = scanner.nextInt();
                if (ace == 1) {
                    valor = 20;
                } else if (ace == 2) {
                    valor = 30;
                } else if (ace == 3) {
                    valor = 40;
                }
                System.out.println(
                        "Gostaria de acrescentar um acessório em seu pet após o banho? Responda com o número da opção desejada: 1-sim 2-não");
                Integer aces = scanner.nextInt();

                if (aces == 1) {
                    System.out.println(
                            " Esses são os acessórios para seu pet! Lembrando que são apenas 1 acessório. Responda com o número da opção desejada: \n 1-Laços R$ 2,00 \n 2-Bandana R$ 3,00 \n 3-Gravata R$ 3,00");
                    int num = scanner.nextInt();
                    
                        if (num == 1) {
                            valor += 2;
                        } else if (num == 2) {
                            valor += 3;
                        } else if (num == 3) {
                            valor += 3;
                        }
                    
                    System.out.println("Seu total é de:" + valor);
                    System.out.println(
                        "Obrigado por fazer seu pedido conosco, aguardamos seu animal aqui no petshop!");

                }
                if (aces == 2) {
                    System.out.println("Seu total é de:" + valor);
                    System.out.println(
                            "Obrigado por fazer seu pedido conosco, aguardamos seu animal aqui no petshop!");

                }

              }

            if (res == 2) {
                System.out.println("Aqui estão os valores a partir do porte de seu pet e do tipo de banho escolhido. \n 1-Pequeno R$ 40,00 \n 2-Médio R$ 50,00 \n 3-Grande R$ 60,00");
                Integer acess = scanner.nextInt();
                if (acess == 1) {
                    valor = 40;
                } else if (acess == 2) {
                    valor = 50;
                } else if (acess == 3) {
                    valor = 60;
                }
                System.out.println("Gostaria de acrescentar um acessório em seu pet após o banho? Responda com o número da opção desejada: 1-sim 2-não");
                Integer pet = scanner.nextInt();

                if (pet == 1) {
                    System.out.println(" Esses são os acessórios para seu pet! Lembrando que são apenas 1 acessório. Responda com o número da opção desejada: \n 1-Laços R$ 2,00 \n 2-Bandana R$ 3,00 \n 3-Gravata R$ 3,00");
                    int num = scanner.nextInt();
          
                        if (num == 1) {
                            valor += 2;
                        } else if (num == 2) {
                            valor += 3;
                        } else if (num == 3) {
                            valor += 3;
                        }
                        System.out.println("Seu total é de:" + valor);
                        System.out.println(
                            "Obrigado por fazer seu pedido conosco, aguardamos seu animal aqui no petshop!");
                    }

                if (pet == 2) {
                    System.out.println("Seu total é de:" + valor);
                    System.out.println("Obrigado por fazer seu pedido conosco, aguardamos seu animal aqui no petshop!");
            }
        
        }

            if (res == 3) {
                valor = 60.0;
                System.out.println("Preço fixo de R$ 60,00");
                System.out.println("Gostaria de acrescentar um acessório em seu pet após o banho? Responda com o número da opção desejada: 1-sim 2-não");
               
                Integer pets = scanner.nextInt();

                if (pets == 1) {
                    System.out.println("Esses são os acessórios para seu pet! Lembrando que são apenas 1 acessório. Responda com o número da opção desejada: \n 1-Laços R$ 2,00 \n 2-Bandana R$ 3,00 \n 3-Gravata R$ 3,00");
                    int num = scanner.nextInt();
                   
                        if (num == 1) {
                            valor += 2;
                        } else if (num == 2) {
                            valor += 3;
                        } else if (num == 3) {
                            valor += 3;
                        }

                        System.out.println("Seu total é de:" + valor);
                        System.out.println(
                            "Obrigado por fazer seu pedido conosco, aguardamos seu animal aqui no petshop!");
                    }

                if (pets == 2) {
                    System.out.println("Seu total é de:" + valor);
                    System.out.println("Obrigado por fazer seu pedido conosco, aguardamos seu animal aqui no petshop!");
            }
            }

            if (res == 4) {
                System.out.println("Aqui estão os valores a partir do porte de seu pet e do tipo de banho escolhido. \n 1-Pequeno R$ 30,00 \n 2-Médio R$ 35,00 \n 3-Grande R$ 45,00");
                Integer shops = scanner.nextInt();

                    if (shops == 1) {
                        valor = 30;
                    } else if (shops == 2) {
                        valor = 35;
                    } else if (shops == 3) {
                        valor = 45;
                    }
                    System.out.println("Gostaria de acrescentar um acessório em seu pet após o banho? Responda com o número da opção desejada: 1-sim 2-não");
                    Integer dog = scanner.nextInt();

                    if (dog == 1) {
                        System.out.println("Esses são os acessórios para seu pet! Lembrando que são apenas 1 acessório. Responda com o número da opção desejada: \n 1-Laços R$ 2,00 \n 2-Bandana R$ 3,00 \n 3-Gravata R$ 3,00");
                        int num = scanner.nextInt();

                            if (num == 1) {
                                valor += 2;
                            } else if (num == 2) {
                                valor += 3;
                            } else if (num == 3) {
                                valor += 3;
                            }
                             System.out.println("Seu total é de:" + valor);
                             System.out.println(
                            "Obrigado por fazer seu pedido conosco, aguardamos seu animal aqui no petshop!");
                    }

                    if (dog == 2) {
                        System.out.println("Seu total é de:" + valor);
                        System.out.println("Obrigado por fazer seu pedido conosco, aguardamos seu animal aqui no petshop!");
                }
            }
        }
            if (var == 2) {
                
                System.out.println(
                        "Escreva aqui sua sugestão ou reclamação para que possamos melhorar e te atender o melhor possível!");
                        String Sugestoes = scanner.next();
                System.out.println("Obrigado por nos enviar sua sugestão! Iremos avaliar.");
            }

        }
    }

    



