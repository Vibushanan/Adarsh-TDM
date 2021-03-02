// ORM class for table 'family'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Feb 27 01:31:47 CST 2021
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class family extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private String rfam_acc;
  public String get_rfam_acc() {
    return rfam_acc;
  }
  public void set_rfam_acc(String rfam_acc) {
    this.rfam_acc = rfam_acc;
  }
  public family with_rfam_acc(String rfam_acc) {
    this.rfam_acc = rfam_acc;
    return this;
  }
  private String rfam_id;
  public String get_rfam_id() {
    return rfam_id;
  }
  public void set_rfam_id(String rfam_id) {
    this.rfam_id = rfam_id;
  }
  public family with_rfam_id(String rfam_id) {
    this.rfam_id = rfam_id;
    return this;
  }
  private Long auto_wiki;
  public Long get_auto_wiki() {
    return auto_wiki;
  }
  public void set_auto_wiki(Long auto_wiki) {
    this.auto_wiki = auto_wiki;
  }
  public family with_auto_wiki(Long auto_wiki) {
    this.auto_wiki = auto_wiki;
    return this;
  }
  private String description;
  public String get_description() {
    return description;
  }
  public void set_description(String description) {
    this.description = description;
  }
  public family with_description(String description) {
    this.description = description;
    return this;
  }
  private String author;
  public String get_author() {
    return author;
  }
  public void set_author(String author) {
    this.author = author;
  }
  public family with_author(String author) {
    this.author = author;
    return this;
  }
  private String seed_source;
  public String get_seed_source() {
    return seed_source;
  }
  public void set_seed_source(String seed_source) {
    this.seed_source = seed_source;
  }
  public family with_seed_source(String seed_source) {
    this.seed_source = seed_source;
    return this;
  }
  private Double gathering_cutoff;
  public Double get_gathering_cutoff() {
    return gathering_cutoff;
  }
  public void set_gathering_cutoff(Double gathering_cutoff) {
    this.gathering_cutoff = gathering_cutoff;
  }
  public family with_gathering_cutoff(Double gathering_cutoff) {
    this.gathering_cutoff = gathering_cutoff;
    return this;
  }
  private Double trusted_cutoff;
  public Double get_trusted_cutoff() {
    return trusted_cutoff;
  }
  public void set_trusted_cutoff(Double trusted_cutoff) {
    this.trusted_cutoff = trusted_cutoff;
  }
  public family with_trusted_cutoff(Double trusted_cutoff) {
    this.trusted_cutoff = trusted_cutoff;
    return this;
  }
  private Double noise_cutoff;
  public Double get_noise_cutoff() {
    return noise_cutoff;
  }
  public void set_noise_cutoff(Double noise_cutoff) {
    this.noise_cutoff = noise_cutoff;
  }
  public family with_noise_cutoff(Double noise_cutoff) {
    this.noise_cutoff = noise_cutoff;
    return this;
  }
  private String comment;
  public String get_comment() {
    return comment;
  }
  public void set_comment(String comment) {
    this.comment = comment;
  }
  public family with_comment(String comment) {
    this.comment = comment;
    return this;
  }
  private String previous_id;
  public String get_previous_id() {
    return previous_id;
  }
  public void set_previous_id(String previous_id) {
    this.previous_id = previous_id;
  }
  public family with_previous_id(String previous_id) {
    this.previous_id = previous_id;
    return this;
  }
  private String cmbuild;
  public String get_cmbuild() {
    return cmbuild;
  }
  public void set_cmbuild(String cmbuild) {
    this.cmbuild = cmbuild;
  }
  public family with_cmbuild(String cmbuild) {
    this.cmbuild = cmbuild;
    return this;
  }
  private String cmcalibrate;
  public String get_cmcalibrate() {
    return cmcalibrate;
  }
  public void set_cmcalibrate(String cmcalibrate) {
    this.cmcalibrate = cmcalibrate;
  }
  public family with_cmcalibrate(String cmcalibrate) {
    this.cmcalibrate = cmcalibrate;
    return this;
  }
  private String cmsearch;
  public String get_cmsearch() {
    return cmsearch;
  }
  public void set_cmsearch(String cmsearch) {
    this.cmsearch = cmsearch;
  }
  public family with_cmsearch(String cmsearch) {
    this.cmsearch = cmsearch;
    return this;
  }
  private Long num_seed;
  public Long get_num_seed() {
    return num_seed;
  }
  public void set_num_seed(Long num_seed) {
    this.num_seed = num_seed;
  }
  public family with_num_seed(Long num_seed) {
    this.num_seed = num_seed;
    return this;
  }
  private Long num_full;
  public Long get_num_full() {
    return num_full;
  }
  public void set_num_full(Long num_full) {
    this.num_full = num_full;
  }
  public family with_num_full(Long num_full) {
    this.num_full = num_full;
    return this;
  }
  private Long num_genome_seq;
  public Long get_num_genome_seq() {
    return num_genome_seq;
  }
  public void set_num_genome_seq(Long num_genome_seq) {
    this.num_genome_seq = num_genome_seq;
  }
  public family with_num_genome_seq(Long num_genome_seq) {
    this.num_genome_seq = num_genome_seq;
    return this;
  }
  private Long num_refseq;
  public Long get_num_refseq() {
    return num_refseq;
  }
  public void set_num_refseq(Long num_refseq) {
    this.num_refseq = num_refseq;
  }
  public family with_num_refseq(Long num_refseq) {
    this.num_refseq = num_refseq;
    return this;
  }
  private String type;
  public String get_type() {
    return type;
  }
  public void set_type(String type) {
    this.type = type;
  }
  public family with_type(String type) {
    this.type = type;
    return this;
  }
  private String structure_source;
  public String get_structure_source() {
    return structure_source;
  }
  public void set_structure_source(String structure_source) {
    this.structure_source = structure_source;
  }
  public family with_structure_source(String structure_source) {
    this.structure_source = structure_source;
    return this;
  }
  private Long number_of_species;
  public Long get_number_of_species() {
    return number_of_species;
  }
  public void set_number_of_species(Long number_of_species) {
    this.number_of_species = number_of_species;
  }
  public family with_number_of_species(Long number_of_species) {
    this.number_of_species = number_of_species;
    return this;
  }
  private Integer number_3d_structures;
  public Integer get_number_3d_structures() {
    return number_3d_structures;
  }
  public void set_number_3d_structures(Integer number_3d_structures) {
    this.number_3d_structures = number_3d_structures;
  }
  public family with_number_3d_structures(Integer number_3d_structures) {
    this.number_3d_structures = number_3d_structures;
    return this;
  }
  private Integer num_pseudonokts;
  public Integer get_num_pseudonokts() {
    return num_pseudonokts;
  }
  public void set_num_pseudonokts(Integer num_pseudonokts) {
    this.num_pseudonokts = num_pseudonokts;
  }
  public family with_num_pseudonokts(Integer num_pseudonokts) {
    this.num_pseudonokts = num_pseudonokts;
    return this;
  }
  private String tax_seed;
  public String get_tax_seed() {
    return tax_seed;
  }
  public void set_tax_seed(String tax_seed) {
    this.tax_seed = tax_seed;
  }
  public family with_tax_seed(String tax_seed) {
    this.tax_seed = tax_seed;
    return this;
  }
  private Double ecmli_lambda;
  public Double get_ecmli_lambda() {
    return ecmli_lambda;
  }
  public void set_ecmli_lambda(Double ecmli_lambda) {
    this.ecmli_lambda = ecmli_lambda;
  }
  public family with_ecmli_lambda(Double ecmli_lambda) {
    this.ecmli_lambda = ecmli_lambda;
    return this;
  }
  private Double ecmli_mu;
  public Double get_ecmli_mu() {
    return ecmli_mu;
  }
  public void set_ecmli_mu(Double ecmli_mu) {
    this.ecmli_mu = ecmli_mu;
  }
  public family with_ecmli_mu(Double ecmli_mu) {
    this.ecmli_mu = ecmli_mu;
    return this;
  }
  private Integer ecmli_cal_db;
  public Integer get_ecmli_cal_db() {
    return ecmli_cal_db;
  }
  public void set_ecmli_cal_db(Integer ecmli_cal_db) {
    this.ecmli_cal_db = ecmli_cal_db;
  }
  public family with_ecmli_cal_db(Integer ecmli_cal_db) {
    this.ecmli_cal_db = ecmli_cal_db;
    return this;
  }
  private Integer ecmli_cal_hits;
  public Integer get_ecmli_cal_hits() {
    return ecmli_cal_hits;
  }
  public void set_ecmli_cal_hits(Integer ecmli_cal_hits) {
    this.ecmli_cal_hits = ecmli_cal_hits;
  }
  public family with_ecmli_cal_hits(Integer ecmli_cal_hits) {
    this.ecmli_cal_hits = ecmli_cal_hits;
    return this;
  }
  private Integer maxl;
  public Integer get_maxl() {
    return maxl;
  }
  public void set_maxl(Integer maxl) {
    this.maxl = maxl;
  }
  public family with_maxl(Integer maxl) {
    this.maxl = maxl;
    return this;
  }
  private Integer clen;
  public Integer get_clen() {
    return clen;
  }
  public void set_clen(Integer clen) {
    this.clen = clen;
  }
  public family with_clen(Integer clen) {
    this.clen = clen;
    return this;
  }
  private Boolean match_pair_node;
  public Boolean get_match_pair_node() {
    return match_pair_node;
  }
  public void set_match_pair_node(Boolean match_pair_node) {
    this.match_pair_node = match_pair_node;
  }
  public family with_match_pair_node(Boolean match_pair_node) {
    this.match_pair_node = match_pair_node;
    return this;
  }
  private Double hmm_tau;
  public Double get_hmm_tau() {
    return hmm_tau;
  }
  public void set_hmm_tau(Double hmm_tau) {
    this.hmm_tau = hmm_tau;
  }
  public family with_hmm_tau(Double hmm_tau) {
    this.hmm_tau = hmm_tau;
    return this;
  }
  private Double hmm_lambda;
  public Double get_hmm_lambda() {
    return hmm_lambda;
  }
  public void set_hmm_lambda(Double hmm_lambda) {
    this.hmm_lambda = hmm_lambda;
  }
  public family with_hmm_lambda(Double hmm_lambda) {
    this.hmm_lambda = hmm_lambda;
    return this;
  }
  private java.sql.Timestamp created;
  public java.sql.Timestamp get_created() {
    return created;
  }
  public void set_created(java.sql.Timestamp created) {
    this.created = created;
  }
  public family with_created(java.sql.Timestamp created) {
    this.created = created;
    return this;
  }
  private java.sql.Timestamp updated;
  public java.sql.Timestamp get_updated() {
    return updated;
  }
  public void set_updated(java.sql.Timestamp updated) {
    this.updated = updated;
  }
  public family with_updated(java.sql.Timestamp updated) {
    this.updated = updated;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof family)) {
      return false;
    }
    family that = (family) o;
    boolean equal = true;
    equal = equal && (this.rfam_acc == null ? that.rfam_acc == null : this.rfam_acc.equals(that.rfam_acc));
    equal = equal && (this.rfam_id == null ? that.rfam_id == null : this.rfam_id.equals(that.rfam_id));
    equal = equal && (this.auto_wiki == null ? that.auto_wiki == null : this.auto_wiki.equals(that.auto_wiki));
    equal = equal && (this.description == null ? that.description == null : this.description.equals(that.description));
    equal = equal && (this.author == null ? that.author == null : this.author.equals(that.author));
    equal = equal && (this.seed_source == null ? that.seed_source == null : this.seed_source.equals(that.seed_source));
    equal = equal && (this.gathering_cutoff == null ? that.gathering_cutoff == null : this.gathering_cutoff.equals(that.gathering_cutoff));
    equal = equal && (this.trusted_cutoff == null ? that.trusted_cutoff == null : this.trusted_cutoff.equals(that.trusted_cutoff));
    equal = equal && (this.noise_cutoff == null ? that.noise_cutoff == null : this.noise_cutoff.equals(that.noise_cutoff));
    equal = equal && (this.comment == null ? that.comment == null : this.comment.equals(that.comment));
    equal = equal && (this.previous_id == null ? that.previous_id == null : this.previous_id.equals(that.previous_id));
    equal = equal && (this.cmbuild == null ? that.cmbuild == null : this.cmbuild.equals(that.cmbuild));
    equal = equal && (this.cmcalibrate == null ? that.cmcalibrate == null : this.cmcalibrate.equals(that.cmcalibrate));
    equal = equal && (this.cmsearch == null ? that.cmsearch == null : this.cmsearch.equals(that.cmsearch));
    equal = equal && (this.num_seed == null ? that.num_seed == null : this.num_seed.equals(that.num_seed));
    equal = equal && (this.num_full == null ? that.num_full == null : this.num_full.equals(that.num_full));
    equal = equal && (this.num_genome_seq == null ? that.num_genome_seq == null : this.num_genome_seq.equals(that.num_genome_seq));
    equal = equal && (this.num_refseq == null ? that.num_refseq == null : this.num_refseq.equals(that.num_refseq));
    equal = equal && (this.type == null ? that.type == null : this.type.equals(that.type));
    equal = equal && (this.structure_source == null ? that.structure_source == null : this.structure_source.equals(that.structure_source));
    equal = equal && (this.number_of_species == null ? that.number_of_species == null : this.number_of_species.equals(that.number_of_species));
    equal = equal && (this.number_3d_structures == null ? that.number_3d_structures == null : this.number_3d_structures.equals(that.number_3d_structures));
    equal = equal && (this.num_pseudonokts == null ? that.num_pseudonokts == null : this.num_pseudonokts.equals(that.num_pseudonokts));
    equal = equal && (this.tax_seed == null ? that.tax_seed == null : this.tax_seed.equals(that.tax_seed));
    equal = equal && (this.ecmli_lambda == null ? that.ecmli_lambda == null : this.ecmli_lambda.equals(that.ecmli_lambda));
    equal = equal && (this.ecmli_mu == null ? that.ecmli_mu == null : this.ecmli_mu.equals(that.ecmli_mu));
    equal = equal && (this.ecmli_cal_db == null ? that.ecmli_cal_db == null : this.ecmli_cal_db.equals(that.ecmli_cal_db));
    equal = equal && (this.ecmli_cal_hits == null ? that.ecmli_cal_hits == null : this.ecmli_cal_hits.equals(that.ecmli_cal_hits));
    equal = equal && (this.maxl == null ? that.maxl == null : this.maxl.equals(that.maxl));
    equal = equal && (this.clen == null ? that.clen == null : this.clen.equals(that.clen));
    equal = equal && (this.match_pair_node == null ? that.match_pair_node == null : this.match_pair_node.equals(that.match_pair_node));
    equal = equal && (this.hmm_tau == null ? that.hmm_tau == null : this.hmm_tau.equals(that.hmm_tau));
    equal = equal && (this.hmm_lambda == null ? that.hmm_lambda == null : this.hmm_lambda.equals(that.hmm_lambda));
    equal = equal && (this.created == null ? that.created == null : this.created.equals(that.created));
    equal = equal && (this.updated == null ? that.updated == null : this.updated.equals(that.updated));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.rfam_acc = JdbcWritableBridge.readString(1, __dbResults);
    this.rfam_id = JdbcWritableBridge.readString(2, __dbResults);
    this.auto_wiki = JdbcWritableBridge.readLong(3, __dbResults);
    this.description = JdbcWritableBridge.readString(4, __dbResults);
    this.author = JdbcWritableBridge.readString(5, __dbResults);
    this.seed_source = JdbcWritableBridge.readString(6, __dbResults);
    this.gathering_cutoff = JdbcWritableBridge.readDouble(7, __dbResults);
    this.trusted_cutoff = JdbcWritableBridge.readDouble(8, __dbResults);
    this.noise_cutoff = JdbcWritableBridge.readDouble(9, __dbResults);
    this.comment = JdbcWritableBridge.readString(10, __dbResults);
    this.previous_id = JdbcWritableBridge.readString(11, __dbResults);
    this.cmbuild = JdbcWritableBridge.readString(12, __dbResults);
    this.cmcalibrate = JdbcWritableBridge.readString(13, __dbResults);
    this.cmsearch = JdbcWritableBridge.readString(14, __dbResults);
    this.num_seed = JdbcWritableBridge.readLong(15, __dbResults);
    this.num_full = JdbcWritableBridge.readLong(16, __dbResults);
    this.num_genome_seq = JdbcWritableBridge.readLong(17, __dbResults);
    this.num_refseq = JdbcWritableBridge.readLong(18, __dbResults);
    this.type = JdbcWritableBridge.readString(19, __dbResults);
    this.structure_source = JdbcWritableBridge.readString(20, __dbResults);
    this.number_of_species = JdbcWritableBridge.readLong(21, __dbResults);
    this.number_3d_structures = JdbcWritableBridge.readInteger(22, __dbResults);
    this.num_pseudonokts = JdbcWritableBridge.readInteger(23, __dbResults);
    this.tax_seed = JdbcWritableBridge.readString(24, __dbResults);
    this.ecmli_lambda = JdbcWritableBridge.readDouble(25, __dbResults);
    this.ecmli_mu = JdbcWritableBridge.readDouble(26, __dbResults);
    this.ecmli_cal_db = JdbcWritableBridge.readInteger(27, __dbResults);
    this.ecmli_cal_hits = JdbcWritableBridge.readInteger(28, __dbResults);
    this.maxl = JdbcWritableBridge.readInteger(29, __dbResults);
    this.clen = JdbcWritableBridge.readInteger(30, __dbResults);
    this.match_pair_node = JdbcWritableBridge.readBoolean(31, __dbResults);
    this.hmm_tau = JdbcWritableBridge.readDouble(32, __dbResults);
    this.hmm_lambda = JdbcWritableBridge.readDouble(33, __dbResults);
    this.created = JdbcWritableBridge.readTimestamp(34, __dbResults);
    this.updated = JdbcWritableBridge.readTimestamp(35, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(rfam_acc, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(rfam_id, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(auto_wiki, 3 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(description, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(author, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(seed_source, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeDouble(gathering_cutoff, 7 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(trusted_cutoff, 8 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(noise_cutoff, 9 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeString(comment, 10 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(previous_id, 11 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cmbuild, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cmcalibrate, 13 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(cmsearch, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(num_seed, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(num_full, 16 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(num_genome_seq, 17 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(num_refseq, 18 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(type, 19 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(structure_source, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(number_of_species, 21 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeInteger(number_3d_structures, 22 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(num_pseudonokts, 23 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(tax_seed, 24 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeDouble(ecmli_lambda, 25 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(ecmli_mu, 26 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeInteger(ecmli_cal_db, 27 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(ecmli_cal_hits, 28 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(maxl, 29 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(clen, 30 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeBoolean(match_pair_node, 31 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeDouble(hmm_tau, 32 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeDouble(hmm_lambda, 33 + __off, 8, __dbStmt);
    JdbcWritableBridge.writeTimestamp(created, 34 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeTimestamp(updated, 35 + __off, 93, __dbStmt);
    return 35;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.rfam_acc = null;
    } else {
    this.rfam_acc = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.rfam_id = null;
    } else {
    this.rfam_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.auto_wiki = null;
    } else {
    this.auto_wiki = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.description = null;
    } else {
    this.description = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.author = null;
    } else {
    this.author = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.seed_source = null;
    } else {
    this.seed_source = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.gathering_cutoff = null;
    } else {
    this.gathering_cutoff = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.trusted_cutoff = null;
    } else {
    this.trusted_cutoff = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.noise_cutoff = null;
    } else {
    this.noise_cutoff = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.comment = null;
    } else {
    this.comment = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.previous_id = null;
    } else {
    this.previous_id = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cmbuild = null;
    } else {
    this.cmbuild = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cmcalibrate = null;
    } else {
    this.cmcalibrate = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.cmsearch = null;
    } else {
    this.cmsearch = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.num_seed = null;
    } else {
    this.num_seed = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.num_full = null;
    } else {
    this.num_full = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.num_genome_seq = null;
    } else {
    this.num_genome_seq = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.num_refseq = null;
    } else {
    this.num_refseq = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.type = null;
    } else {
    this.type = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.structure_source = null;
    } else {
    this.structure_source = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.number_of_species = null;
    } else {
    this.number_of_species = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.number_3d_structures = null;
    } else {
    this.number_3d_structures = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.num_pseudonokts = null;
    } else {
    this.num_pseudonokts = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.tax_seed = null;
    } else {
    this.tax_seed = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ecmli_lambda = null;
    } else {
    this.ecmli_lambda = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.ecmli_mu = null;
    } else {
    this.ecmli_mu = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.ecmli_cal_db = null;
    } else {
    this.ecmli_cal_db = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.ecmli_cal_hits = null;
    } else {
    this.ecmli_cal_hits = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.maxl = null;
    } else {
    this.maxl = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.clen = null;
    } else {
    this.clen = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.match_pair_node = null;
    } else {
    this.match_pair_node = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.hmm_tau = null;
    } else {
    this.hmm_tau = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.hmm_lambda = null;
    } else {
    this.hmm_lambda = Double.valueOf(__dataIn.readDouble());
    }
    if (__dataIn.readBoolean()) { 
        this.created = null;
    } else {
    this.created = new Timestamp(__dataIn.readLong());
    this.created.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.updated = null;
    } else {
    this.updated = new Timestamp(__dataIn.readLong());
    this.updated.setNanos(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.rfam_acc) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rfam_acc);
    }
    if (null == this.rfam_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rfam_id);
    }
    if (null == this.auto_wiki) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.auto_wiki);
    }
    if (null == this.description) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, description);
    }
    if (null == this.author) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, author);
    }
    if (null == this.seed_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, seed_source);
    }
    if (null == this.gathering_cutoff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.gathering_cutoff);
    }
    if (null == this.trusted_cutoff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.trusted_cutoff);
    }
    if (null == this.noise_cutoff) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.noise_cutoff);
    }
    if (null == this.comment) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, comment);
    }
    if (null == this.previous_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, previous_id);
    }
    if (null == this.cmbuild) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cmbuild);
    }
    if (null == this.cmcalibrate) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cmcalibrate);
    }
    if (null == this.cmsearch) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, cmsearch);
    }
    if (null == this.num_seed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.num_seed);
    }
    if (null == this.num_full) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.num_full);
    }
    if (null == this.num_genome_seq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.num_genome_seq);
    }
    if (null == this.num_refseq) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.num_refseq);
    }
    if (null == this.type) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, type);
    }
    if (null == this.structure_source) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, structure_source);
    }
    if (null == this.number_of_species) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.number_of_species);
    }
    if (null == this.number_3d_structures) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.number_3d_structures);
    }
    if (null == this.num_pseudonokts) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.num_pseudonokts);
    }
    if (null == this.tax_seed) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, tax_seed);
    }
    if (null == this.ecmli_lambda) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ecmli_lambda);
    }
    if (null == this.ecmli_mu) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.ecmli_mu);
    }
    if (null == this.ecmli_cal_db) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ecmli_cal_db);
    }
    if (null == this.ecmli_cal_hits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.ecmli_cal_hits);
    }
    if (null == this.maxl) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.maxl);
    }
    if (null == this.clen) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.clen);
    }
    if (null == this.match_pair_node) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.match_pair_node);
    }
    if (null == this.hmm_tau) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.hmm_tau);
    }
    if (null == this.hmm_lambda) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeDouble(this.hmm_lambda);
    }
    if (null == this.created) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.created.getTime());
    __dataOut.writeInt(this.created.getNanos());
    }
    if (null == this.updated) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.updated.getTime());
    __dataOut.writeInt(this.updated.getNanos());
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(rfam_acc==null?"null":rfam_acc, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rfam_id==null?"null":rfam_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(auto_wiki==null?"null":"" + auto_wiki, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(description==null?"null":description, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(author==null?"null":author, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(seed_source==null?"null":seed_source, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(gathering_cutoff==null?"null":"" + gathering_cutoff, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(trusted_cutoff==null?"null":"" + trusted_cutoff, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(noise_cutoff==null?"null":"" + noise_cutoff, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(comment==null?"null":comment, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(previous_id==null?"null":previous_id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cmbuild==null?"null":cmbuild, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cmcalibrate==null?"null":cmcalibrate, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(cmsearch==null?"null":cmsearch, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(num_seed==null?"null":"" + num_seed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(num_full==null?"null":"" + num_full, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(num_genome_seq==null?"null":"" + num_genome_seq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(num_refseq==null?"null":"" + num_refseq, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(type==null?"null":type, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(structure_source==null?"null":structure_source, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_of_species==null?"null":"" + number_of_species, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(number_3d_structures==null?"null":"" + number_3d_structures, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(num_pseudonokts==null?"null":"" + num_pseudonokts, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(tax_seed==null?"null":tax_seed, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ecmli_lambda==null?"null":"" + ecmli_lambda, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ecmli_mu==null?"null":"" + ecmli_mu, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ecmli_cal_db==null?"null":"" + ecmli_cal_db, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ecmli_cal_hits==null?"null":"" + ecmli_cal_hits, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(maxl==null?"null":"" + maxl, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(clen==null?"null":"" + clen, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(match_pair_node==null?"null":"" + match_pair_node, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hmm_tau==null?"null":"" + hmm_tau, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hmm_lambda==null?"null":"" + hmm_lambda, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(created==null?"null":"" + created, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(updated==null?"null":"" + updated, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.rfam_acc = null; } else {
      this.rfam_acc = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.rfam_id = null; } else {
      this.rfam_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.auto_wiki = null; } else {
      this.auto_wiki = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.description = null; } else {
      this.description = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.author = null; } else {
      this.author = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.seed_source = null; } else {
      this.seed_source = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.gathering_cutoff = null; } else {
      this.gathering_cutoff = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.trusted_cutoff = null; } else {
      this.trusted_cutoff = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.noise_cutoff = null; } else {
      this.noise_cutoff = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.comment = null; } else {
      this.comment = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.previous_id = null; } else {
      this.previous_id = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cmbuild = null; } else {
      this.cmbuild = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cmcalibrate = null; } else {
      this.cmcalibrate = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.cmsearch = null; } else {
      this.cmsearch = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.num_seed = null; } else {
      this.num_seed = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.num_full = null; } else {
      this.num_full = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.num_genome_seq = null; } else {
      this.num_genome_seq = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.num_refseq = null; } else {
      this.num_refseq = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.type = null; } else {
      this.type = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.structure_source = null; } else {
      this.structure_source = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_of_species = null; } else {
      this.number_of_species = Long.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.number_3d_structures = null; } else {
      this.number_3d_structures = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.num_pseudonokts = null; } else {
      this.num_pseudonokts = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.tax_seed = null; } else {
      this.tax_seed = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ecmli_lambda = null; } else {
      this.ecmli_lambda = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ecmli_mu = null; } else {
      this.ecmli_mu = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ecmli_cal_db = null; } else {
      this.ecmli_cal_db = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ecmli_cal_hits = null; } else {
      this.ecmli_cal_hits = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.maxl = null; } else {
      this.maxl = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.clen = null; } else {
      this.clen = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.match_pair_node = null; } else {
      this.match_pair_node = BooleanParser.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hmm_tau = null; } else {
      this.hmm_tau = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hmm_lambda = null; } else {
      this.hmm_lambda = Double.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.created = null; } else {
      this.created = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.updated = null; } else {
      this.updated = java.sql.Timestamp.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    family o = (family) super.clone();
    o.created = (o.created != null) ? (java.sql.Timestamp) o.created.clone() : null;
    o.updated = (o.updated != null) ? (java.sql.Timestamp) o.updated.clone() : null;
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("rfam_acc", this.rfam_acc);
    __sqoop$field_map.put("rfam_id", this.rfam_id);
    __sqoop$field_map.put("auto_wiki", this.auto_wiki);
    __sqoop$field_map.put("description", this.description);
    __sqoop$field_map.put("author", this.author);
    __sqoop$field_map.put("seed_source", this.seed_source);
    __sqoop$field_map.put("gathering_cutoff", this.gathering_cutoff);
    __sqoop$field_map.put("trusted_cutoff", this.trusted_cutoff);
    __sqoop$field_map.put("noise_cutoff", this.noise_cutoff);
    __sqoop$field_map.put("comment", this.comment);
    __sqoop$field_map.put("previous_id", this.previous_id);
    __sqoop$field_map.put("cmbuild", this.cmbuild);
    __sqoop$field_map.put("cmcalibrate", this.cmcalibrate);
    __sqoop$field_map.put("cmsearch", this.cmsearch);
    __sqoop$field_map.put("num_seed", this.num_seed);
    __sqoop$field_map.put("num_full", this.num_full);
    __sqoop$field_map.put("num_genome_seq", this.num_genome_seq);
    __sqoop$field_map.put("num_refseq", this.num_refseq);
    __sqoop$field_map.put("type", this.type);
    __sqoop$field_map.put("structure_source", this.structure_source);
    __sqoop$field_map.put("number_of_species", this.number_of_species);
    __sqoop$field_map.put("number_3d_structures", this.number_3d_structures);
    __sqoop$field_map.put("num_pseudonokts", this.num_pseudonokts);
    __sqoop$field_map.put("tax_seed", this.tax_seed);
    __sqoop$field_map.put("ecmli_lambda", this.ecmli_lambda);
    __sqoop$field_map.put("ecmli_mu", this.ecmli_mu);
    __sqoop$field_map.put("ecmli_cal_db", this.ecmli_cal_db);
    __sqoop$field_map.put("ecmli_cal_hits", this.ecmli_cal_hits);
    __sqoop$field_map.put("maxl", this.maxl);
    __sqoop$field_map.put("clen", this.clen);
    __sqoop$field_map.put("match_pair_node", this.match_pair_node);
    __sqoop$field_map.put("hmm_tau", this.hmm_tau);
    __sqoop$field_map.put("hmm_lambda", this.hmm_lambda);
    __sqoop$field_map.put("created", this.created);
    __sqoop$field_map.put("updated", this.updated);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("rfam_acc".equals(__fieldName)) {
      this.rfam_acc = (String) __fieldVal;
    }
    else    if ("rfam_id".equals(__fieldName)) {
      this.rfam_id = (String) __fieldVal;
    }
    else    if ("auto_wiki".equals(__fieldName)) {
      this.auto_wiki = (Long) __fieldVal;
    }
    else    if ("description".equals(__fieldName)) {
      this.description = (String) __fieldVal;
    }
    else    if ("author".equals(__fieldName)) {
      this.author = (String) __fieldVal;
    }
    else    if ("seed_source".equals(__fieldName)) {
      this.seed_source = (String) __fieldVal;
    }
    else    if ("gathering_cutoff".equals(__fieldName)) {
      this.gathering_cutoff = (Double) __fieldVal;
    }
    else    if ("trusted_cutoff".equals(__fieldName)) {
      this.trusted_cutoff = (Double) __fieldVal;
    }
    else    if ("noise_cutoff".equals(__fieldName)) {
      this.noise_cutoff = (Double) __fieldVal;
    }
    else    if ("comment".equals(__fieldName)) {
      this.comment = (String) __fieldVal;
    }
    else    if ("previous_id".equals(__fieldName)) {
      this.previous_id = (String) __fieldVal;
    }
    else    if ("cmbuild".equals(__fieldName)) {
      this.cmbuild = (String) __fieldVal;
    }
    else    if ("cmcalibrate".equals(__fieldName)) {
      this.cmcalibrate = (String) __fieldVal;
    }
    else    if ("cmsearch".equals(__fieldName)) {
      this.cmsearch = (String) __fieldVal;
    }
    else    if ("num_seed".equals(__fieldName)) {
      this.num_seed = (Long) __fieldVal;
    }
    else    if ("num_full".equals(__fieldName)) {
      this.num_full = (Long) __fieldVal;
    }
    else    if ("num_genome_seq".equals(__fieldName)) {
      this.num_genome_seq = (Long) __fieldVal;
    }
    else    if ("num_refseq".equals(__fieldName)) {
      this.num_refseq = (Long) __fieldVal;
    }
    else    if ("type".equals(__fieldName)) {
      this.type = (String) __fieldVal;
    }
    else    if ("structure_source".equals(__fieldName)) {
      this.structure_source = (String) __fieldVal;
    }
    else    if ("number_of_species".equals(__fieldName)) {
      this.number_of_species = (Long) __fieldVal;
    }
    else    if ("number_3d_structures".equals(__fieldName)) {
      this.number_3d_structures = (Integer) __fieldVal;
    }
    else    if ("num_pseudonokts".equals(__fieldName)) {
      this.num_pseudonokts = (Integer) __fieldVal;
    }
    else    if ("tax_seed".equals(__fieldName)) {
      this.tax_seed = (String) __fieldVal;
    }
    else    if ("ecmli_lambda".equals(__fieldName)) {
      this.ecmli_lambda = (Double) __fieldVal;
    }
    else    if ("ecmli_mu".equals(__fieldName)) {
      this.ecmli_mu = (Double) __fieldVal;
    }
    else    if ("ecmli_cal_db".equals(__fieldName)) {
      this.ecmli_cal_db = (Integer) __fieldVal;
    }
    else    if ("ecmli_cal_hits".equals(__fieldName)) {
      this.ecmli_cal_hits = (Integer) __fieldVal;
    }
    else    if ("maxl".equals(__fieldName)) {
      this.maxl = (Integer) __fieldVal;
    }
    else    if ("clen".equals(__fieldName)) {
      this.clen = (Integer) __fieldVal;
    }
    else    if ("match_pair_node".equals(__fieldName)) {
      this.match_pair_node = (Boolean) __fieldVal;
    }
    else    if ("hmm_tau".equals(__fieldName)) {
      this.hmm_tau = (Double) __fieldVal;
    }
    else    if ("hmm_lambda".equals(__fieldName)) {
      this.hmm_lambda = (Double) __fieldVal;
    }
    else    if ("created".equals(__fieldName)) {
      this.created = (java.sql.Timestamp) __fieldVal;
    }
    else    if ("updated".equals(__fieldName)) {
      this.updated = (java.sql.Timestamp) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
