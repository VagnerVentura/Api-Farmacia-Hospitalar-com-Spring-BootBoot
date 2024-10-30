////@Entity
////@Table(name = "tb_estoque")
////public class Estoque {
////
////    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
////    private Long id;
////    
////    @OneToOne
////    @JoinColumn(name = "medicamento_id")
////    private Medicamento medicamento;
////    
////    private int quantidadeAtual;
////}
//
//@Entity
//@Table(name = "tb_prescricoes")
//public class Prescricao {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    
//    @OneToOne
//    @JoinColumn(name = "medico_id")
//    private Medico medico;
//    
//    @OneToOne
//    @JoinColumn(name = "paciente_id")
//    private Paciente paciente;
//    
//    @OneToMany(mappedBy = "prescricao")
//    private List<PrescricaoMedicamento> medicamentosPrescritos;
//}
//
//java
//Copy code
//@Entity
//@Table(name = "tb_prescricao_medicamento")
//public class PrescricaoMedicamento {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    
//    @ManyToOne
//    @JoinColumn(name = "prescricao_id")
//    private Prescricao prescricao;
//    
//    @ManyToOne
//    @JoinColumn(name = "medicamento_id")
//    private Medicamento medicamento;
//    
//    private int quantidadePrescrita;
//}
//
//@Entity
//@Table(name = "tb_movimentacoes_estoque")
//public class MovimentacaoEstoque {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    
//    @ManyToOne
//    @JoinColumn(name = "medicamento_id")
//    private Medicamento medicamento;
//    
//    private int quantidade;
//    private String tipoMovimentacao; // "ENTRADA" ou "SAIDA"
//    private Date dataMovimentacao;
//}