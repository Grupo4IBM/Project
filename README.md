# Project
<h3 align="center">
    Desafio 01 - Programa If Black Then Code - Gama Academy & IBM
</h3>
<p align="center">
<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/>
</p>
<h2 align= "center" >
    API - Loja Tudo De Bom 
</h2>

<p align="center">
<img align="center" src="https://blog.memed.com.br/wp-content/uploads/2021/01/shutterstock_1723332388-scaled.jpg" style="width: 55%;" alt="Capa">
</p>

<p align="center"> Plataforma para controle de estoque e gerenciamento de cadastro de clientes e transações de vendas. </p>
    

<h2>:pill: Sobre a Tudo de Bom:</h2>
<h4> A Tudo de Bom é uma farmácia que não comercializa apenas medicamentos, mas também produtos para higiene e cuidados pessoais, bem como outros tipos de produtos. A loja pretende adquirir sua própria plataforma de gestão, e precisa de uma API para gerenciar seu estoque e seu banco de dados de clientes. A empresa deseja poder realizar as seguintes ações em sua plataforma:
    
<br>
<br>
 
* Cadastrar, Listar, Atualizar e Excluir de dados de clientes;
* Acessar o histório das transações de vendas;  
* Controlar o estoque, adicionando e removendo produtos;  
* Automatizar a aplicação de descontos em medicamentos genéricos.   
</h4>

<h2>🛠️ Desenvolvimento </h2>
<h4> 

Em ...\src\main\java\com\tudoDeBom\Project encontramos os pacotes criados para desenvolvimento da API, nestes pacotes teremos Classes e Interfaces que mais adiante veremos como funcionam e para que servem. Entendendo melhor os pacotes então, temos:
    
<br> 
    :package: com.tudoDeBom.Project
    
Este é um pacote que contém a classe ProjectApplication.java que realiza a inicialização da aplicação do Spring Boot;
    
<br>    
    :package: com.tudoDeBom.Project.Controller
    
Contém a classes que possuem métodos CRUD e suas respectivas anotações JPA, que tornam possível a comunicação entre a API e o Banco de Dados MySql. As classes são:
    
* ClienteController.java; 
* ProdutoController.java; 
* PedidoController.java. 
    
<br>
    :package: com.tudoDeBom.Project.Model
    
Aqui, temos classes que contém a declaração de seus atributos e seus respectivos getters, setters e a estrutura `toSting()`. Essas classes são:
    
* Cliente.java;
* Pedido.java;
* ItemPedido.java;
* Produto.java.
    
 <br>    
    :package: com.tudoDeBom.Project.Repository
    
Este pacote contém interfaces herdeiras da interface JPARepository, que possui uma variedade de métodos como `save()`,  `delete()` e `findAll()`, por exemplo. Essa relação é útil para a injeção de dependência. As interfaces contidas neste pacote são:
    
* ClienteRpository;
* ProdutoRepository;
* PedidoRepository;
    
<br>    
    :package: com.tudoDeBom.Project.Service 
    
O pacote service tem classes e interfaces. As interfaces possuem a declaração de métodos, como por exemplo `listar()`, `listarPeloNome()`, `editar()`, entre outros, enquanto as classes correspondentes implementam estas interfaces e descrevem as ações dos métodos. As classes e interfaces são:

* ClienteService.java
* ClienteServiceInterface.java
* PedidoService.java
* PedidoServiceInterface.java
* ProdutoService.java
* ProdutoServiceInterface.java
    
</h4>


<h2>⚙️ Executando os testes</h2>
<h4> 
   
   
  
   * GET - Listar todos os clientes
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Cliente/GET%20-%20Listar%20Todos%20Clientes.PNG" width="750" height="450"  />
<br>

   * GET - Listar clientes pelo ID
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Cliente/GET%20-%20Listar%20Cliente%20Pelo%20ID.PNG" width="750" height="450" />
<br>

   * GET - Listar clientes pelo nome
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Cliente/GET%20-%20Listar%20Cliente%20Pelo%20Nome.PNG" width="750" height="450" />
<br>

   * GET - Listar todos os pedidos
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Pedido/GET%20-%20Listar%20Todos%20os%20Pedidos.PNG" width="750" height="450" />
<br>
   
   * GET - Listar pedidos pelo ID
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Pedido/GET%20-%20Listar%20Pedido%20Pelo%20ID.PNG" width="750" height="450" />
<br>

   * GET - Listar todos os produtos
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Produto/GET%20-%20Listar%20Todos%20os%20Produtos.PNG" width="750" height="450" />
<br>

   * GET - Listar produtos pelo ID
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Produto/GET%20-%20Listar%20Pelo%20ID.PNG" width="750" height="450" />
<br>
<br>  
  
   * PUT - Atualizar clientes
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Cliente/PUT%20-%20Atualizar%20Cliente.PNG" width="750" height="450" />
<br>

  * PUT - Atualizar clientes
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Cliente/PUT%20-%20Atualizar%20Cliente.PNG" width="750" height="450" />
<br>
 
  * PUT - Atualizar produtos
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Produto/PUT%20-%20Atualizar%20Produto.PNG" width="750" height="450" />
<br>

  * POST - Cadastrar clientes
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Cliente/POST%20-%20Cadastrar%20Cliente.PNG" width="750" height="450" />
<br>

  * POST - Cadastrar produtos
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Produto/POST%20-%20Cadastrar%20Produto.PNG" width="750" height="450" />
<br>

  * DELETE - Deletar cliente
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Cliente/DELETE%20-%20Deletar%20Cliente.PNG" width="750" height="450" />
<br>

  * DELETE - Deletar produto
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Produto/DELETE%20-%20Deletar%20Produto.PNG" width="750" height="450" />
<br>

  * CREATED - Criar novo pedido
   
   <img src="https://github.com/Grupo4IBM/Project/blob/teste/relatorios%20de%20reuniao/registros%20endpoints/End-Point%20Pedido/CREATE%20-%20Cadastrar%20Novo%20Pedido.PNG" width="750" height="450" />
<br>
    
    
    
    
</h4>

<br>
<br>

<h2>💻 Tecnologias: <h2>
<br>
<table align="center" style=" width: 60%" >
  <tr>
    <td align="center">
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" width="150" height="120" />
    <td align="center">
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/mysql/mysql-original-wordmark.svg" width="150" height="120"/>
    <td align="center">
    <img  src="https://programadoresbrasil.com.br/wp-content/uploads/2021/05/Spring-BOOT-Interview-questions-1.jpg" width="150" height="50"/>
    <td align="center">
    <img src="https://tm.ibxk.com.br/2022/06/01/01090719586019.jpg?ims=1120x420" width="150" height="50" />
   <td align="center">
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/git/git-plain-wordmark.svg" width="150" height="120" />
   <td align="center">
   <img  src="https://pbs.twimg.com/media/EzocAl3XsAAW09w.png" width="150" height="50"/>

  <tr>
   <td align="center">
   <img  src="https://s3.amazonaws.com//beta-img.b2bstack.net/uploads/production/product/product_image/25967/eclipse.png" width="80" height="80">
   <td align="center">
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original-wordmark.svg" width="90" height="110"/>
   <td align="center">
    <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-plain-wordmark.svg" width="100" height="120"/>
   <td align="center">
   <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/css3/css3-plain-wordmark.svg" width="100" height="120"/>
   <td align="center">
   <img  src="https://iwanta.tech/wp-content/uploads/2021/05/Create-views-with-Thymeleaf.jpg" width="180" height="60"/>
 </tr>

</table>

<h2>🏆 DevTeam: </h2>

<br>

<table>
  <tr>
  <td align="center"><img style="width: 70%; border-radius: 50%" 
  src="https://avatars.githubusercontent.com/u/93226440?v=4"
   alt="Cristhiane da Cruz"/><br /><sub style="font-size: 14px"><b>Cristhiane da Cruz</b></sub><br /> 
  <a href="https://www.linkedin.com/in/barroscruzc/" alt="Linkedin">
  <br>
<img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://https://www.linkedin.com/in/barroscruzc/" style= "width:90px;"/>
  </a>

  <td align="center"><img style="width: 70%; border-radius: 50%"
  src="https://avatars.githubusercontent.com/u/80930522?v=4" 
  alt="Paulo Henrique"/><br /><sub><b>Paulo Henrique</b></sub></a><br /> 
  <a href="https://www.linkedin.com/in/paulohenrique3140/" alt="Linkedin">
  <br>
<img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://https://www.linkedin.com/in/paulohenrique3140/"  style= "width:90px;"/>
  </a>
  
  <td align="center"><img style="width: 70%; border-radius: 50%"
  src="https://avatars.githubusercontent.com/u/73142478?v=4" 
  alt="Caio Negrão"/><br /><sub><b>Caio Negrão</b></sub></a><br />
   <a href="https://www.linkedin.com/in/caionegraods/" alt="Linkedin">
  <br>
  <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://https://www.linkedin.com/in/caionegraods/"  style= "width:90px;"/>
  </a>

  <td align="center"><img style="width: 70%; border-radius: 50%" 
  src="https://avatars.githubusercontent.com/u/85911861?v=4" 
  alt="Cássia Leal"/><br /><sub><b>Cássia Leal</b></sub></a><br />
  <a href="https://www.linkedin.com/in/cassia-leal/" alt="Linkedin">
  <br>
  <img src="https://img.shields.io/badge/-Linkedin-1C1C1C?style=for-the-badge&logo=Linkedin&logoColor=00FFFF&link=https://https://www.linkedin.com/in/cassia-leal/"  style= "width:90px;"/>
  </a>

</table>
   
  
    
  <h2>🎁 Agradecimentos </h2>
  <h4>Agradecemos à IBM pela oportunidade de participarmos desta bela iniciativa que é o programa de treinamento If Black, Then Code, voltado para estudantes pretos(as) e pardos(as), que proporciona a ampliação de conhecimentos e de qualificação na área de desenvolvimento Back End e DevOps (Java).
      Agradeçemos também à Gama Academy e seus Yellow Belts pelo apoio e atenção nestas primeiras 2 semanas de treinamento, e aos professores Isidro em suas espetaculares aulas assíncronas e Ricardo Alexandre Bontempo em suas suuuuper monitorias.
  <h4>
      
 <p align="center">
 <img src="https://media0.giphy.com/media/4rZA5D22301iMgrUNd/giphy.gif?cid=ecf05e47rnjomlrsp4x5zsilwsff06fqzbe630cbqgsmrmoj&rid=giphy.gif&ct=g"/>
 </p>
      
  <h4 align= "center" >
  O aprendizado é contínuo e sempre haverá um próximo nível!
  <h4>
