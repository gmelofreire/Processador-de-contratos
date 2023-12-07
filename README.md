# Processador de Contratos

## Visão Geral
O Processador de Contratos é um programa projetado para analisar dados contratuais, incluindo número do contrato, data de início, valor total e número de parcelas. O programa calcula os valores das parcelas, levando em consideração os termos de pagamento do serviço usado — neste caso, o PayPal. O PayPal aplica uma taxa de juros simples de 1% ao mês e uma taxa de 2% sobre cada pagamento.

O projeto destaca o uso de interfaces para alcançar um acoplamento fraco entre as classes `ServicoContrato` e `ServicoPayPal`, facilitando possíveis modificações futuras no código.

## Funcionalidades
- **Entrada de Dados do Contrato:** O programa recebe os dados do contrato, incluindo número do contrato, data de início, valor total e número de parcelas.
- **Cálculo de Pagamento:** Calcula os valores das parcelas com base nos dados do contrato fornecidos, incorporando a taxa de juros especificada e a taxa de pagamento.

## Uso
1. **Inserir Dados do Contrato:** Forneça os detalhes do contrato necessários para o programa.
2. **Executar o Programa:** Execute o programa para calcular os valores das parcelas.
3. **Saída:** Receba informações sobre o valor a ser pago para cada parcela, levando em consideração a taxa de juros e a taxa do PayPal.

## Considerações Futuras
- **Extensibilidade:** O uso de interfaces facilita futuras alterações ou adições de plataformas de pagamento.
- **Modularidade:** Cada classe de serviço é projetada para lidar com responsabilidades específicas, promovendo organização e manutenção do código.
- **Escalabilidade:** O programa pode ser expandido para suportar recursos adicionais ou acomodar diferentes provedores de pagamento.

## Como Começar
1. Clone o repositório.
2. Abra o projeto usando o eclipse.
3. Execute o programa e insira os detalhes do contrato necessários.

## Dependências
- Este projeto está escrito em Java.
- Não são necessárias bibliotecas ou frameworks externos no momento.
