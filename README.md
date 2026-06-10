# Trabalho final de fundamentos

Integrantes do grupo:

Caio Persch Espindola (26102478)

Gabriel Franco (26102988)

Arthur Dietrich de Morais ()

O sistema é constituido por 5 classes: Pessoa, Aluno, Bolsista, Acompanhamento e Menu. O método main se localiza na classe Menu e, quando chamado, passa a receber informações do usuário por meio de um loop while e um switch case.
Ao inserir qual das 16 ações possiveis o usuario deseja realizar, os metodos apropriados são chamados, das classes Acompanhamento ou Aluno.
A relação entre as classes Pessoa, Aluno e Bolsista é de composição. Uma instancia de Bolsista possui um atributo do tipo Aluno, o qual possui um atributo do tipo Pessoa.
Um objeto da classe Acompanhamento possui uma instancia da classe Aluno, alem de varias variáveis que representam os diferente tipos de atividades entregues. A partir desses dados, o risco pedagógico é calculado como sendo a média aritmética entre as porcentagens de atividades feitas com IA, não explicadas, feitas com ajuda, e que utilizam funcionalidades não estudadas. 
