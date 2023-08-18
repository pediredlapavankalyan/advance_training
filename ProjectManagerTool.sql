CREATE TABLE [User] (
  [id] int PRIMARY KEY,
  [email] varchar(50),
  [password] varchar(20),
  [first_name] varchar(50),
  [second_name] varchar(50)
)
GO

CREATE TABLE [Workspace] (
  [id] int PRIMARY KEY,
  [name] varchar(30),
  [created_user_id] int
)
GO

CREATE TABLE [workspace_members] (
  [user_id] int,
  [workspace_id] int,
  PRIMARY KEY ([user_id], [workspace_id])
)
GO

CREATE TABLE [Board] (
  [id] int PRIMARY KEY,
  [title] varchar(30),
  [created_user_id] int
)
GO

CREATE TABLE [List] (
  [id] int PRIMARY KEY,
  [title] varchar(50),
  [board_id] int
)
GO

CREATE TABLE [Card] (
  [id] int PRIMARY KEY,
  [name] varchar(30),
  [list_id] int
)
GO

ALTER TABLE [Workspace] ADD FOREIGN KEY ([created_user_id]) REFERENCES [User] ([id])
GO

ALTER TABLE [Board] ADD FOREIGN KEY ([created_user_id]) REFERENCES [User] ([id])
GO

ALTER TABLE [List] ADD FOREIGN KEY ([board_id]) REFERENCES [Board] ([id])
GO

ALTER TABLE [Card] ADD FOREIGN KEY ([list_id]) REFERENCES [List] ([id])
GO

ALTER TABLE [workspace_members] ADD FOREIGN KEY ([user_id]) REFERENCES [User] ([id])
GO

ALTER TABLE [workspace_members] ADD FOREIGN KEY ([workspace_id]) REFERENCES [Workspace] ([id])
GO
