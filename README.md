README – OLIMPIADAS DE QUESTÃO - Refatoração com SOLID
 
 * Principais mudanças

Antes a classe App fazia praticamente tudo: lia dados, validava, executava regras e salvava.
Organizei separando as responsabilidades.
Substituí o switch-case por Map
- o menu não decide mais o que fazer, só executa
Removi métodos estáticos da classe App
- agora uso classes Service para organizar melhor
Tirei listas e variáveis soltas
- agora estão dentro dos Repositories com interface e implementação

 - SRP

Antes a classe App tinha várias responsabilidades.

Aplicando SRP, dividi o sistema em:

AcaoMenu → interagir com o usuário e chamar o Service
Service → processar regras de negócio e fazer validações
Repository → armazenar e buscar dados (usando ArrayList)

Agora cada classe tem uma responsabilidade específica.


 - OCP 

Com a classe Menu e a interface AcaoMenu, o código ficou aberto para extensão e fechado para alteração.

Antes precisava mexer no switch-case para adicionar novas opções.

Agora:

não precisa modificar a classe Menu
basta criar uma nova classe que implementa AcaoMenu
e adicionar no Map


 - LSP 

Na relação entre AcaoMenu e suas implementações (como SairAcao, CadastrarParticipanteAcao, etc.),

todas podem substituir a interface sem quebrar o sistema.

A classe Menu trabalha apenas com AcaoMenu, sem precisar saber qual ação específica está sendo executada.



 - ISP

A interface AcaoMenu possui apenas os métodos necessários.
As interfaces de Repository também possuem apenas métodos de persistência.

Assim, nenhuma classe implementa métodos que não precisa.



 - DIP 

Foi aplicado usando construtores nas classes de Ação e Service.

As classes não criam suas próprias dependências, elas recebem por parâmetro.

Exemplo: Service recebendo Repository.

Isso deixa o código menos acoplado e facilita mudanças futuras sem quebrar o sistema.



