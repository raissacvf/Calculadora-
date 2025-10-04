Este é um projeto de estudo desenvolvido para aprimorar os conhecimentos em Java, com foco em Programação Orientada a Objetos (POO) e a criação de Interfaces Gráficas (GUI) utilizando a biblioteca Swing.
O projeto evoluiu de uma calculadora de console simples para uma aplicação desktop completa.

🚀 Funcionalidades
A calculadora realiza as quatro operações matemáticas básicas:
• Adição (+)
• Subtração (-)
• Multiplicação (*)
• Divisão (/)

💡 Conceitos de Java Aplicados
Este mini projeto foi crucial para praticar e entender os seguintes tópicos:

1. Programação Orientada a Objetos (POO)
O código foi refatorado para seguir o princípio de Separação de Responsabilidades:

• Calculos.java (Lógica de Negócios): Esta classe é responsável apenas por executar os cálculos. Ela recebe dois números e o operador e retorna o resultado.
• Encapsulamento: A lógica de cálculo está isolada, tornando-a reutilizável e fácil de testar.
• Tratamento de Exceções: Implementação de throw new IllegalArgumentException() para lidar com casos inválidos (como divisão por zero ou operador desconhecido).
• Interface.java (Apresentação): Esta classe é responsável apenas pela interação com o usuário e pela exibição da GUI.

2. Interface Gráfica (Swing)
O projeto migrou do console para uma interface visual usando a biblioteca Swing:

• Componentes Swing: Uso de JFrame (a janela principal), JTextField (o visor/display) e JButton (os botões numéricos e de operação).
• Gerenciadores de Layout (Layout Managers): Utilização de BorderLayout (para display e painel) e GridLayout (para dispor os botões em uma grade 4x4).
• Manipulação de Eventos: Implementação da interface ActionListener para capturar os cliques nos botões (actionPerformed) e acionar a lógica de cálculo.

3. Fundamentos da Linguagem

• Entrada/Saída (I/O): Uso inicial da classe Scanner no console.
• Estruturas de Controle: Uso da estrutura switch-case para selecionar a operação correta.
• Conversão de Tipos: Conversão de texto (String do display) para números (double para cálculo) usando Double.parseDouble().
