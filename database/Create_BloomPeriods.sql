USE [Plants]
GO

/****** Object:  Table [dbo].[BloomPeriods]    Script Date: 11/10/2024 12:12:49 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

DROP TABLE [dbo].[BloomPeriods]
GO

CREATE TABLE [dbo].[BloomPeriods](
	[BloomID] [int] IDENTITY(1,1) NOT NULL,
	[PlantID] [int] NOT NULL,
	[Month] [int] NULL,
 CONSTRAINT [PK_BloomPeriods] PRIMARY KEY CLUSTERED 
(
	[BloomID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[BloomPeriods]  WITH CHECK ADD  CONSTRAINT [FK_BloomPeriods_Table_1] FOREIGN KEY([PlantID])
REFERENCES [dbo].[Plants] ([PlantID])
GO

ALTER TABLE [dbo].[BloomPeriods] CHECK CONSTRAINT [FK_BloomPeriods_Table_1]
GO

