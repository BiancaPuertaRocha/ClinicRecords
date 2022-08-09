# ClinicRecords
Java desktop system develope in 2018 with the old version of Netbeans IDE. The project is a little messy because of the IDE but the important part is at ClinicRecords/src

## Escopo
O sistema em questão tem por objetivo tornar mais eficiente o atendimento de pacientes em um posto de saúde. É essencial que haja, nos postos de saúde, o prontuário dos pacientes que visitam o local e usufruem dos serviços. O sistema foi criado visando tornar o documento virtual e mais fácil o acesso por qualquer funcionário autorizado a acessar tais dados.
Os registros de pacientes e fichas de atendimento são registros que podem ser efetuados no sistema pelo profissional da área a qualquer momento. Uma ficha de atendimento deve ser registrada sempre que o paciente comparecer ao posto para algum tipo de atendimento que devem ser cadastrados previamente. Caso o atendimento necessite de um médico, o médico deverá ser informado durante o agendamento do atendimento de acordo com a disponibilidade do mesmo e, a data da consulta. Uma pré-consulta deve ser registrada antes da consulta com os dados do paciente, esta pré-sonculta deve confirmar a presença do paciente. O agendamento de uma consulta ocorre ao gerar uma ficha com o atendimento que corresponde a mesma.
O paciente chega ao local e entra em contato com um funcionário que alimentará o sistema para gerar a ficha de atendimento. Caso o paciente não tenha um cadastro no sistema, deverá ser efetuado para que possa prosseguir com os serviços. Se o tipo de atendimento na ficha requerer atenção médica, então o paciente se dirige ao técnico que fará a pré-consulta indicando ao sistema alguns dados imediatos do consultado. Uma lista é gerada para o médico para que ele tenha controle de quantos pacientes estão em espera (que já passaram na pré-consulta). Cada médico tem um máximo de atendimentos por dia, este é informado no momento do cadastro do médico.
Durante a consulta, o médico pode prescrever um medicamento em uma receita e/ou fazer a prescrição de um exame para que seja registrado na consulta e conste no prontuário.
O Clinic Records pode ter usuários de três tipos: Funcionário comum, administrador e médico. Ao funcionário cabe a função de preencher prontuários e organizar o agendamento de consultas aos médicos referentes e realizar o registro da pré-consulta, além de acessar os dados do paciente, poder gerar o prontuário e relatórios.
Os usuários podem ser cadastrados em apenas um setor que deve ser escolhido de acordo com a sua formação e experiência. Os setores, tipos de atendimento, funcionários e médicos só podem ser cadastrados no sistema pelo administrador. O administrador é responsável por efetuar o cadastro dos demais usuários, de tipos de atendimento e tem acesso a todo o sistema deliberadamente. 	
O médico deve registrar a consulta para fazer anotações referentes e receitar medicamentos e prescrever exames. Pelo nível de acesso do médico, podem ser visualizados todos os pacientes agendados e os confirmados para a consulta, ou seja, todos os que passaram pela pré consulta.
De acordo com as receitas, podem ser gerados relatórios de medicamentos mais receitados para tal problema sugerido em pesquisa.

## Documentação [aqui](https://github.com/BiancaPuertaRocha/ClinicRecords/blob/main/Documentacao/doc_clinic_records.pdf)
