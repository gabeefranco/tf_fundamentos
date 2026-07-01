# Trabalho final de fundamentos

---

TITULO DO PROJETO: TF

PROPOSITO DO PROJETO: A partir da escolha do usuario, o programa executa o metodo respectivo da escolha, com o projeto sendo um conjunto de metodos que conversam entre si, fundalmentalmente passando pela classe Gerenciador e sendo executados no Menu, esse sendo onde o método main se encontra.

COMO COMECAR O PROJETO: Inicialize o projeto clicando com o botao direito na classe Menu e selecionando o metodo main.

AUTORES: Caio Persch Espindola (26102478), Gabriel Franco (26102988), Arthur Dietrich de Morais (26106328) 

---

INSTRUCOES PARA USUARIO:
    Esscolha uma opção do menu digitando o numero correspondente:
	
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
         15 - Ranking
         16 - Encerrar o programa
    
    Ao inserir qual das 16 ações possiveis o usuario deseja realizar, os metodos apropriados são chamados, das classes Acompanhamento ou Aluno. Depois, o programa retornara para o menu, ate o usuario escolher sair.
    Voce pode criar quantos Alunos, Bolsistas, Listas, etc, que voce dsejar sem precisar reiniciar o programa.

---

COMO O PROGRAMA FUNCIONA:

	O sistema é constituido por 8 classes: Pessoa, Aluno, Bolsista, Acompanhamento, Dados, Erro, Gerenciador e Menu. O método main se localiza na classe Menu e, quando chamado, passa a receber informações do usuário por meio de um loop while e um switch case.
	Apos o input do usuario um dos metodos sera "rodado".
	
    Explicacao das classes:
		Pessoa: É apenas uma classe básica de pessoa, contendo os atributos nome, idade e local de nascimento.
		
		Aluno: É a classe base da criação de um aluno, contendo os atributos Pessoa, curso, matricula, semestre, ano e bolsista.
		
		Bolsista: É a classe base da criação de um bolsista, contendo os atributos Aluno, projeto e orientador.
		
		Acompanhamento: É a classe onde os metodos do cálculo de risco pedagógico estão, contendo também um método de "get.label" que retorna a classificação dos alunos entre os riscos de ALTO, MODERADO ou BAIXO.
		
		Dados: É a classe onde occore as intancieções de vetores de objetos, também contendo alguns dos métodos
		
		Gerenciador: A classe contendo alguns dos métodos principais, também servindo de intermediário entre as classes Dados e Menu.
		
		Erro: Classe contendo mensagens erros diversos que podem ocorrer durante a execução do programa.
		
		Menu: A classe que contem o menu de seleção interativo com todos os métodos, também sendo a classe que tem o método main.
    
  RISCOS PEDAGOGICOS:
  
	O método escolhido de como definir o risco pedagógico foi de calcular a média aritmética entre as porcentagens de atividades feitas com IA, não explicadas, feitas com ajuda, e que utilizam funcionalidades não estudadas; sendo os dados utilizados para os cálculos, originados da classe Acompanhamento, que possui uma instancia da classe Aluno e várias variáveis que representam os diferentes tipos de atividades entregues. 

---
  
VERSION CONTROL:

1.0
    Feito pelos 3 membros juntos.
    Cada um fez uma parte inicial do projeto.

2.0
	Gabriel fez a classe Gerenciador.
	Caio fez a classe Dados.
	Arthur fez a classe Menu.

3.0
	Caio fez a classe Erros.
	Diversas correções foram feitas.

4.0
	Revisão final e consenso de finalização do trabalho por todos os membros.

---    
    
REFERENCIAS:

    Não utilizamos referencias durante a produção do trabalho.
	
    
RELATORIO:

    Conceitos apredidos durante o andamento de todo o semestre foram muito reforcados, principalmente sobre vetores de objetos e como compor uma classe com outra.
	
	Não foram utilizadas nenhuma ferramenta de IA durante a produção do trabalho.
	
	Não tivemos nenhuma dificuldade grande, e os questionamentos que surgiram durante a programação foram discutidas por todos entre o grupo, chegando em um consenso e aplicando nossas ideias.
	


























----
Texto antigo:

O sistema é constituido por 5 classes: Pessoa, Aluno, Bolsista, Acompanhamento e Menu. O método main se localiza na classe Menu e, quando chamado, passa a receber informações do usuário por meio de um loop while e um switch case.
Ao inserir qual das 16 ações possiveis o usuario deseja realizar, os metodos apropriados são chamados, das classes Acompanhamento ou Aluno.
A relação entre as classes Pessoa, Aluno e Bolsista é de composição. Uma instancia de Bolsista possui um atributo do tipo Aluno, o qual possui um atributo do tipo Pessoa.
Um objeto da classe Acompanhamento possui uma instancia da classe Aluno, alem de varias variáveis que representam os diferente tipos de atividades entregues. A partir desses dados, o risco pedagógico é calculado como sendo a média aritmética entre as porcentagens de atividades feitas com IA, não explicadas, feitas com ajuda, e que utilizam funcionalidades não estudadas. 
