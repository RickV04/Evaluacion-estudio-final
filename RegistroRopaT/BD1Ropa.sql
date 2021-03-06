USE [master]
GO
/****** Object:  Database [BD1Ropa]    Script Date: 15/07/2021 9:46:54 ******/
CREATE DATABASE [BD1Ropa]
 
GO
USE [BD1Ropa]
GO
/****** Object:  Table [dbo].[Clasificacion]    Script Date: 15/07/2021 9:46:55 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Clasificacion](
	[codigo] [int] IDENTITY(1,1) NOT NULL,
	[Tipo] [nvarchar](40) NULL,
	[estado] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Producto]    Script Date: 15/07/2021 9:46:55 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Producto](
	[codigo] [int] IDENTITY(1,1) NOT NULL,
	[producto] [nvarchar](30) NULL,
	[marca] [nvarchar](20) NULL,
	[talla] [nvarchar](5) NULL,
	[sexo] [nvarchar](2) NULL,
	[precio] [float] NULL,
	[existencia] [int] NULL,
	[codclasificacion] [int] NULL,
	[estado] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Usuario]    Script Date: 15/07/2021 9:46:55 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Usuario](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[pwd] [nvarchar](60) NULL,
	[username] [nvarchar](60) NULL,
	[estado] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Clasificacion] ON 

INSERT [dbo].[Clasificacion] ([codigo], [Tipo], [estado]) VALUES (2, N'Uniforme', 1)
INSERT [dbo].[Clasificacion] ([codigo], [Tipo], [estado]) VALUES (3, N'Veraniega', 2)
INSERT [dbo].[Clasificacion] ([codigo], [Tipo], [estado]) VALUES (2003, N'Hirlandesa', 1)
INSERT [dbo].[Clasificacion] ([codigo], [Tipo], [estado]) VALUES (2004, N'Inglesa', 1)
INSERT [dbo].[Clasificacion] ([codigo], [Tipo], [estado]) VALUES (2005, N'Suelta', 1)
INSERT [dbo].[Clasificacion] ([codigo], [Tipo], [estado]) VALUES (2006, N'Trabajo', 1)
INSERT [dbo].[Clasificacion] ([codigo], [Tipo], [estado]) VALUES (2007, N'Trabajo', 1)
INSERT [dbo].[Clasificacion] ([codigo], [Tipo], [estado]) VALUES (2008, N'Trabajo', 1)
SET IDENTITY_INSERT [dbo].[Clasificacion] OFF
GO
SET IDENTITY_INSERT [dbo].[Producto] ON 

INSERT [dbo].[Producto] ([codigo], [producto], [marca], [talla], [sexo], [precio], [existencia], [codclasificacion], [estado]) VALUES (1, N'camisa', N'Muriel', N'XL', N'M', 40, 10, 2, 1)
INSERT [dbo].[Producto] ([codigo], [producto], [marca], [talla], [sexo], [precio], [existencia], [codclasificacion], [estado]) VALUES (1002, N'Pantalon', N'Levis', N'Xl', N'M', 34.599998474121094, 20, 3, 1)
INSERT [dbo].[Producto] ([codigo], [producto], [marca], [talla], [sexo], [precio], [existencia], [codclasificacion], [estado]) VALUES (2002, N'Camisa sin manda', N'VIs', N'S', N'M', 100.90000152587891, 40, 3, 1)
INSERT [dbo].[Producto] ([codigo], [producto], [marca], [talla], [sexo], [precio], [existencia], [codclasificacion], [estado]) VALUES (2003, N'pantalon', N'Flo', N'L', N'M', 180, 50, 2, 1)
INSERT [dbo].[Producto] ([codigo], [producto], [marca], [talla], [sexo], [precio], [existencia], [codclasificacion], [estado]) VALUES (2008, N'Calcetin', N'Lacros', N'L', N'F', 20, 20, 3, 1)
INSERT [dbo].[Producto] ([codigo], [producto], [marca], [talla], [sexo], [precio], [existencia], [codclasificacion], [estado]) VALUES (2009, N'Medias', N'YY', N'L', N'F', 200.99000549316406, 30, 3, 1)
SET IDENTITY_INSERT [dbo].[Producto] OFF
GO
SET IDENTITY_INSERT [dbo].[Usuario] ON 

INSERT [dbo].[Usuario] ([Id], [pwd], [username], [estado]) VALUES (1002, N'100721', N'Ricardo Villarreal', 2)
INSERT [dbo].[Usuario] ([Id], [pwd], [username], [estado]) VALUES (2008, N'The World', N'Francisco Molina', 1)
INSERT [dbo].[Usuario] ([Id], [pwd], [username], [estado]) VALUES (2009, N'150721', N'Diana AmpiE', 2)
SET IDENTITY_INSERT [dbo].[Usuario] OFF
GO
ALTER TABLE [dbo].[Clasificacion] ADD  DEFAULT ((1)) FOR [estado]
GO
ALTER TABLE [dbo].[Producto] ADD  DEFAULT ((1)) FOR [estado]
GO
ALTER TABLE [dbo].[Usuario] ADD  CONSTRAINT [DF_Usuario_estado]  DEFAULT ((1)) FOR [estado]
GO
ALTER TABLE [dbo].[Producto]  WITH CHECK ADD FOREIGN KEY([codclasificacion])
REFERENCES [dbo].[Clasificacion] ([codigo])
GO
USE [master]
GO
ALTER DATABASE [BD1Ropa] SET  READ_WRITE 
GO
