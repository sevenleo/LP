Primeira Lista de Exerc�cios
============================

Introdu��o
----------

Baixe o [projeto da lista](lista1.zip), que est� preparado para funcionar tanto com o SBT quanto
com o eclipse, e implemente as fun��es correspondentes a cada quest�o do exerc�cio. Depois envie
apenas o arquivo `package.scala` com os fontes da sua implementa��o, usando o formul�rio no final
dessa p�gina.

Quest�o 1 - Tri�ngulo de Pascal
-------------------------------

O *tri�ngulo de Pascal* � uma representa��o gr�fica dos coeficientes dos bin�mios `(x+y)^n`.
Cada linha do tri�ngulo lista os coeficientes do seu respectivo bin�nio (contado a partir de 0).

![Tri�ngulo de Pascal](http://upload.wikimedia.org/math/6/8/7/68716cad06e288afb1ed5266c711b66b.png)

Os n�meros nos lados do tri�ngulo s�o sempre 1, e cada n�mero do interior do tri�ngulo � a soma dos dois
n�meros acima dele. Implemente uma fun��o em Scala que calcula coeficientes do tri�ngulo de Pascal, dada
sua posi��o no tri�ngulo, contada a partir de 0:

    def pascal(col: Int, lin: Int): Int = ???

Quest�o 2 - Par�nteses Balanceados
----------------------------------

Escreva uma fun��o que verifica se os par�nteses presentes em uma lista de caracteres est�o balanceados. Note que
n�o basta contar o n�mero de `(` e `)`, pois listas como `List(')','(')` e `List('(',')',')','(')` n�o s�o
balanceadas.

    def balanceado(l: List[Char]): Boolean = ???

Para facilitar o teste use a fun��o `toList` de Scala, que converte uma string em uma lista de caracteres:

    > balanceado("so (um (teste) (da funcao) ) ".toList)
    res0: Boolean = true

Use recurs�o final na sua resposta.

Quest�o 3 - Quicksort
---------------------

A ideia do algoritmo de ordena��o *quicksort* � bem simples: escolhemos um elemento *piv�* de uma lista
(o primeiro elemento, por exemplo), e *particionamos* a lista usando esse piv� em duas listas. A primeira
lista tem todos os elementos menores ou iguais ao piv�, e a segunda lista todos os elementos maiores que
o piv�. Ent�o basta ordenar essas duas listas e concatenar o resultado.

Escreva a fun��o `particao` que particiona uma lista dado um elemento piv�:

    def particao(l: List[Int], pivo: Int): (List[Int], List[Int]) = ???

Escreva a fun��o `quicksort` para ordenar uma lista, usando a fun��o de parti��o que voc� escreveu:

    def quicksort(l: List[Int]): List[Int] = ???

Quest�o 4 - CR acumulado
------------------------

Podemos representar as notas de um aluno da UFRJ em dado semestre como uma lista de pares
*(nota,creditos)*:

    > val sem1 = List((9.5,3),(7.3,4),(5.0,3),(4.0,4))
    sem1: List[(Double, Int)] = List((9.5,3), (7.3,4), (5.0,3), (4.0,4))

O coeficiente de rendimento (CR) de um aluno em determinado semestre � a m�dia ponderada
de suas notas, com o peso de cada uma sendo o n�mero de cr�ditos da mat�ria.

Escreva a fun��o `crSemestre` que recebe as notas do aluno no semestre e retorna seu
CR para aquele semestre e o n�mero de cr�ditos que o aluno cursou:

    def crSemestre(notas: List[(Double, Int)]): (Double, Int) = ???

As notas do aluno durante o curso podem ser representadas como uma lista de listas de notas
para cada semestre. O *CR acumulado* de um aluno em determinado momento do curso � uma m�dia
ponderada dos CRs de cada semestre, com o peso sendo o n�mero de cr�ditos cursado naquele
semestre.

Escreva a fun��o `crsAcumulados` que recebe a lista de listas de notas para cada semestre e
retorna uma lista com o CR acumulado para o aluno ap�s cada semestre (o CR acumulado
ap�s o primero semestre � o CR do primeiro semestre), assim como o total de cr�ditos cursados
at� aquele momento.

    def crsAcumulados(semestres: List[List[(Double, Int)]]): (List[Double], Int) = ???

Entrega da lista
----------------

Use o formul�rio abaixo para enviar a sua lista. Lembre de enviar apenas o arquivo `package.scala` que
voc� modificou. O prazo para envio � sexta-feira, dia 26/04/2013.

<script type="text/javascript" src="http://form.jotformz.com/jsform/31014701317641">
// dummy
</script>
