Feature: Search
  Desafio de automação Agibank

    @e2e
  Scenario: Página de resultados é exibida corretamente
    Given eu navego para a página inicial
    And eu pesquiso pelo termo "juros"
    Then eu vejo a página de resultados
    And eu vejo um header com o texto "Resultados encontrados para: juros"

    @smoke
  Scenario: SearchBar realiza pesquisa ao apertar Enter
    Given eu navego para a página inicial
    And eu pesquiso pelo termo "ágil" e aperto Enter
    Then eu vejo a página de resultados
    And eu vejo um header com o texto "Resultados encontrados para: ágil"

  Scenario: Mensagem de Resultado não encontrado é exibida corretamente
    Given eu navego para a página inicial
    And eu pesquiso pelo termo "#$%#$#$" e aperto Enter
    Then eu vejo a página de resultados
    And a seção de resultados está vazia
    And a seção de resultados exibe a mensagem "Lamentamos, mas nada foi encontrado para sua pesquisa, tente novamente com outras palavras."

  Scenario: Lista de resultados é exibida
    Given eu navego para a página inicial
    And eu pesquiso pelo termo "ágil" e aperto Enter
    Then eu vejo a página de resultados
    And a lista de resultados é maior que 0
