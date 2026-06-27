# Trabalho final de fundamentos

---

TITULO DO PROJETO: TF
PROPOSITO DO PROJETO: A partir da escolha do usuario, o programa executa o metodo respectivo da escolha, com o projeto sendo um conjunto de metodos que(CONTINUAR)
COMO COMECAR O PROJETO: Inicialize o projeto clicando com o botao direito na classe Menu e selecionando o metodo main.
AUTORES: Caio Persch Espindola (26102478), Gabriel Franco (26102988), Arthur Dietrich de Morais (26106328) 

---
OK--
INSTRUCOES PARA USUARIO:
    Esscolha uma opcao do menu digitando o numero correspondente:
         1 - Cadastrar um aluno
         2 - Cadastrar um bolsista
         3 - Registrar dados de acompanhamento
         4 - Listar alunos
         5 - Listar bolsistas
         6 - Aluno com maior nome
         7 - Total de vogais
         8 - Calcular percentual dos alunos
         9 - Calcular media de idade dos alunos
         10 - Criar/Atualizar lista de chamada
         11 - Lista de chamada
         12 - Calculo do risco pedagogico
         13 - Relatorio geral do risco pedagogico
         14 - Mostrar alunos em alto risco
         15 - (Inovacao)
         16 - Encerrar o programa
    
    Ao inserir qual das 16 ações possiveis o usuario deseja realizar, os metodos apropriados são chamados, das classes Acompanhamento ou Aluno. Depois, o programa retornara para o menu, ate o usuario escolher sair.
    Voce pode criar quantos Alunos, Bolsistas, Listas, etc, que voce dsejar sem precisar reiniciar o programa.

---

COMO O PROGRAMA FUNCIONA:
	O sistema é constituido por 5 classes: Pessoa, Aluno, Bolsista, Acompanhamento e Menu. O método main se localiza na classe Menu e, quando chamado, passa a receber informações do usuário por meio de um loop while e um switch case.
	Apos o input do usuario um dos metodos sera "rodado".
	
    Explicacao dos metodos:
    
  
---
  
VERSION CONTROL:
1.0
    Feito pelos 3 membros juntos.
    Cada um fez uma parte inicial do projeto.

    
---    
    
REFERENCIAS:
    https://docs.oracle.com/javase/tutorial/java/index.html
    
RELATORIO:
    Os questionamentos que surgiram durante a programacao foram discutidas por todos entre o grupo.
    Conceitos apredidos durante o andamento de todo o semestre foram muito reforcados.


























----
Texto antigo:

O sistema é constituido por 5 classes: Pessoa, Aluno, Bolsista, Acompanhamento e Menu. O método main se localiza na classe Menu e, quando chamado, passa a receber informações do usuário por meio de um loop while e um switch case.
Ao inserir qual das 16 ações possiveis o usuario deseja realizar, os metodos apropriados são chamados, das classes Acompanhamento ou Aluno.
A relação entre as classes Pessoa, Aluno e Bolsista é de composição. Uma instancia de Bolsista possui um atributo do tipo Aluno, o qual possui um atributo do tipo Pessoa.
Um objeto da classe Acompanhamento possui uma instancia da classe Aluno, alem de varias variáveis que representam os diferente tipos de atividades entregues. A partir desses dados, o risco pedagógico é calculado como sendo a média aritmética entre as porcentagens de atividades feitas com IA, não explicadas, feitas com ajuda, e que utilizam funcionalidades não estudadas. 
