# SOLID-concepts
#Tell, don't ask e Fail Fast

Mande, ao invés de perguntar, é um dos inúmeros princípios para deixar nosso código mais próximo do que a Orientação a Objetos sugere, e é muito simples de implementar.


#Orientação a objetos
#coesão
união harmônica entre atributos e métodos  que representam algo em comum de uma classe

classes não coesas tendem a crescer indefinidamente, e se tornam difíceis de manter.

classe coesa - Uma classe que executa bem a sua única tarefa, de forma concisa.

ex Funcionario com atributos a mais do que a clase comporta

#encapsulamento

 código protegido  de violações  externas sem validação, além de aumentar o acoplamento
encapsulamento é uma forma de manter os objetos das nossas classes protegidos, fornecendo apenas o que é estritamente necessário para o mundo exterior.
O fato de criar getters e setters para tudo, na verdade, quebra o encapsulamento da nossa classe.
Ao encapsular o acesso a determinados dados, liberando acesso apenas ao necessário, os objetos da nossa classe se tornam mais fáceis de serem utilizados.

#acoplamento

agrupamento

não tem como não existir acoplamento. O problema é quando as classes dependem muito uma da outra.

Classes acopladas causam fragilidade no código da aplicação, o que dificulta a manutenção

É fato que, se estamos organizando o nosso código, seguindo as recomendações da orientação a objetos, algum acoplamento acontecerá. Algumas classes precisarão de outras, para que não tenham muitas responsabilidades. Cabe a nós medir quando faz sentido adicionar tal acoplamento com as dependências e como depender do que é seguro

#refatoração
É uma alteração no código que visa melhorar sua clareza e entendimento.  Refatorações servem para melhorar o design do código, e não o funcionamento do sistema. Uma refatoração não deve influenciar em nada no funcionamento.

# SOLID
#single responsibilility principle - SRP - S
principio da responsabilidade única

coesão esta ligada com esse principio

"uma classe deveria ter apenas um único motivo para mudar" Uncle Bob

A ideia é a classe ter motivo para mudar quando tiver alguma alteração especifica para ela, não por causa de outra classe.



#open closed principle  - O

redução de acoplamento

entidades de software devem estar abertas para extensão, porém fechadas para modificação. 
Temos que implementar de uma maneira extensivel, para adicionar novas regras não devemos mexer em códigos existentes

isso acaba sendo utilizado no polimorfismos
com a abstraçao  de um impl por exemplo
cada vez que o impl é reutilizado mais adiçoes podemos implementar no codigo, sem mexer no que ja estava pronto  e funcional evitando assim gerar bugs.

#liskov substitution principle

as vezes o que é herdado pela classe filha não faz sentido pra ela. Nesse caso quando elas tem atributos em comum é boa pratica utilizar a composição.

lembrar do pato de borracha


#interface segregation principle -I
as vezes temos que implementar interfaces que não fazem sentido para a gente

uma classe não deveria ser forçada a depender de métodos que não utilizara

posso implementar duas interfaces 
ou fazer uma interface com herança de outra interface


#dependecy inversion principle - D

classe é mais instável
o acoplamento é inevitável, portanto se for acoplar, acople com estruturas que são mais estáveis como interfaces

abstrações não devem depender de implementações. implementações devem depender de abstrações
Se um método muda a forma como realiza sua tarefa, desde que a interface se mantenha, não vamos precisar nos preocupar nem em editar o nosso código.

SOD - implementando o O somos induzidos a  implementar o S e o D

