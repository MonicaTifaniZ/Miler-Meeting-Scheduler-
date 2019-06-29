/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     6/19/2019 7:10:21 PM                         */
/*==============================================================*/


drop table if exists ANGGOTA_KEGIATAN;

drop table if exists LPJ;

drop table if exists NOTULEN;

drop table if exists PEMINJAMAN;

drop table if exists RUANGAN;

drop table if exists USER;

/*==============================================================*/
/* Table: ANGGOTA_KEGIATAN                                      */
/*==============================================================*/
create table ANGGOTA_KEGIATAN
(
   USERNAME             varchar(20),
   KODE_PINJAM          int
);

/*==============================================================*/
/* Table: LPJ                                                   */
/*==============================================================*/
create table LPJ
(
   KODE_PINJAM          int not null,
   TUJUAN_KEGIATAN      varchar(200),
   DESKRIPSI            varchar(200),
   SASARAN_KEGIATAN     varchar(200),
   WAKTU                datetime,
   TEMPAT               varchar(100),
   KETUA                varchar(100),
   primary key (KODE_PINJAM)
);

/*==============================================================*/
/* Table: NOTULEN                                               */
/*==============================================================*/
create table NOTULEN
(
   KODE_PINJAM          int not null,
   RAPAT_KE             varchar(2),
   TEMPAT               varchar(100),
   TANGGAL              date,
   JAM                  time,
   PEMIMPIN_RAPAT       varchar(100),
   PESERTA              varchar(500),
   HASIL                varchar(500),
   primary key (KODE_PINJAM)
);

/*==============================================================*/
/* Table: PEMINJAMAN                                            */
/*==============================================================*/
create table PEMINJAMAN
(
   KODE_PINJAM          int not null,
   USERNAME             varchar(20) not null,
   KODE_RUANGAN         varchar(20) not null,
   JENIS_KEGIATAN       varchar(15),
   TANGGAL              date,
   JAM_MULAI            time,
   JAM_BERAKHIR         time,
   STATUS               varchar(15),
   primary key (KODE_PINJAM)
);

/*==============================================================*/
/* Table: RUANGAN                                               */
/*==============================================================*/
create table RUANGAN
(
   KODE_RUANGAN         varchar(20) not null,
   KAPASITAS            int,
   primary key (KODE_RUANGAN)
);

/*==============================================================*/
/* Table: USER                                                  */
/*==============================================================*/
create table USER
(
   USERNAME             varchar(20) not null,
   NAMA_USER            varchar(30),
   STATUS_USER          varchar(15),
   PASSWORD             varchar(20),
   primary key (USERNAME)
);

alter table ANGGOTA_KEGIATAN add constraint FK_REFERENCE_3 foreign key (USERNAME)
      references USER (USERNAME) on delete restrict on update restrict;

alter table ANGGOTA_KEGIATAN add constraint FK_REFERENCE_4 foreign key (KODE_PINJAM)
      references PEMINJAMAN (KODE_PINJAM) on delete restrict on update restrict;

alter table LPJ add constraint FK_REFERENCE_5 foreign key (KODE_PINJAM)
      references PEMINJAMAN (KODE_PINJAM) on delete restrict on update restrict;

alter table NOTULEN add constraint FK_REFERENCE_6 foreign key (KODE_PINJAM)
      references PEMINJAMAN (KODE_PINJAM) on delete restrict on update restrict;

alter table PEMINJAMAN add constraint FK_RELATIONSHIP_1 foreign key (USERNAME)
      references USER (USERNAME) on delete restrict on update restrict;

alter table PEMINJAMAN add constraint FK_RELATIONSHIP_2 foreign key (KODE_RUANGAN)
      references RUANGAN (KODE_RUANGAN) on delete restrict on update restrict;

