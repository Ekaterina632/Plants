USE [Plants]
GO

/****** Object:  Table [dbo].[Photos]    Script Date: 11/10/2024 12:18:09 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Photos](
	[PhotoID] [int] NOT NULL,
	[PhotoURL] [varchar](max) NOT NULL,
	[PlantID] [int] NOT NULL,
	[UploadedBy] [int] NULL,
 CONSTRAINT [PK_Photos] PRIMARY KEY CLUSTERED 
(
	[PhotoID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

ALTER TABLE [dbo].[Photos]  WITH CHECK ADD  CONSTRAINT [FK_Photos_Users] FOREIGN KEY([UploadedBy])
REFERENCES [dbo].[Users] ([UserID])
GO

ALTER TABLE [dbo].[Photos] CHECK CONSTRAINT [FK_Photos_Users]
GO

